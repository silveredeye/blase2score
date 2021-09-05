package logic;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.wmn4j.io.musicxml.MusicXmlWriter;
import org.wmn4j.notation.Duration;
import org.wmn4j.notation.KeySignatures;
import org.wmn4j.notation.MeasureBuilder;
import org.wmn4j.notation.NoteBuilder;
import org.wmn4j.notation.PartBuilder;
import org.wmn4j.notation.Pitch;
import org.wmn4j.notation.Pitch.Accidental;
import org.wmn4j.notation.Pitch.Base;
import org.wmn4j.notation.RestBuilder;
import org.wmn4j.notation.Score.Attribute;
import org.wmn4j.notation.ScoreBuilder;

import data.ScoreableGame;

public class ScoreWriter {
	private static Duration DURATION = Duration.of(1, 4);
	
	public static void makeScore(ScoreableGame game, Integer limit) {
		String title = game.getFullDescription();
		ScoreBuilder scoreBuilder = new ScoreBuilder();
		scoreBuilder.setAttribute(Attribute.TITLE, title);
		scoreBuilder.setAttribute(Attribute.COMPOSER, "Blaseball");
		scoreBuilder.setAttribute(Attribute.ARRANGER, "silveredeye & Blase2Score");
		
		PartBuilder partBuilder = new PartBuilder(title);
		
		List<String> gameInMeasures = getGameUpdateTextInMeasureChunks(game, limit);
		for(Integer i=0; i<gameInMeasures.size(); i++) {
			MeasureBuilder measureBuilder = new MeasureBuilder(i);
			if (i == 0) {
				measureBuilder.setKeySignature(KeySignatures.DMAJ_BMIN);
			}
			for (String character: gameInMeasures.get(i).split("")) {
				if (character.equals(" ")) {
					measureBuilder.addToVoice(1, new RestBuilder(DURATION));
				} else {
					measureBuilder.addToVoice(1, new NoteBuilder(getPitchFromCharacter(character), DURATION));
				}
			}
			partBuilder.add(measureBuilder);
		}
		scoreBuilder.addPart(partBuilder);
		writeToFile(scoreBuilder);
	}
	
	public static void writeToFile(ScoreBuilder scoreBuilder) {
		MusicXmlWriter writer = MusicXmlWriter.writerFor(scoreBuilder.build());
		Path path = Paths.get("score.xml");
		writer.write(path);
		System.out.println("XML file has been written!");
	}
	
	private static List<String> getGameUpdateTextInMeasureChunks(ScoreableGame game, Integer limit) {
		String textToBeScored = getConcatenatedGameUpdates(game, limit);
		List<String> chunks = new ArrayList<String>();
		
		int idx = 0;
		while (idx + 4 < textToBeScored.length()) {
			chunks.add(textToBeScored.substring(idx, idx + 4));
			idx += 4;
		}
		return chunks;
	}
	
	private static String getConcatenatedGameUpdates(ScoreableGame game, Integer limit) {
		String gameUpdates = "";
		Integer numberOfUpdatesToScore = limit < game.getGameUpdates().size() ? limit : game.getGameUpdates().size();
		for (int i = 0; i<numberOfUpdatesToScore; i++) {
			gameUpdates = gameUpdates.concat(game.getGameUpdates().get(i)).concat(" ");
		}
		return gameUpdates;
	}
	
	private static Pitch getPitchFromCharacter(String character) {
		if (character.equals("0")) {
			return Pitch.of(Base.C, Accidental.NATURAL, 4);
		} else if (character.equals("1")) {
			return Pitch.of(Base.D, Accidental.NATURAL, 4);
		} else if (character.equals("2")) {
			return Pitch.of(Base.E, Accidental.NATURAL, 4);
		} else if (character.equals("3")) {
			return Pitch.of(Base.F, Accidental.NATURAL, 4);
		} else if (character.equals("4")) {
			return Pitch.of(Base.G, Accidental.NATURAL, 4);
		} else if (character.equals("5")) {
			return Pitch.of(Base.A, Accidental.NATURAL, 4);
		} else if (character.equals("6")) {
			return Pitch.of(Base.B, Accidental.NATURAL, 4);
		} else if (character.equals("7")) {
			return Pitch.of(Base.C, Accidental.NATURAL, 5);
		} else if (character.equals("8")) {
			return Pitch.of(Base.D, Accidental.NATURAL, 5);
		} else if (character.equals("9")) {
			return Pitch.of(Base.E, Accidental.NATURAL, 5);
		} else if (character.equals("a")) {
			return Pitch.of(Base.F, Accidental.NATURAL, 5);
		} else if (character.equals("b")) {
			return Pitch.of(Base.G, Accidental.NATURAL, 5);
		} 
		return null;
	}
}
