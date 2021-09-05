package data.chronicler;

public class BlaseGame {
	
	private String id;
	private String[] basesOccupied;
	private String[] baseRunners;
	private String[] baseRunnerNames;
	private String[] outcomes;
	private String terminology;
	private String lastUpdate;
	private String rules;
	private String statsheet;
	private String awayPitcher;
	private String awayPitcherName;
	private String awayBatter;
	private String awayBatterName;
	private String awayTeam;
	private String awayTeamName;
	private String awayTeamNickname;
	private String awayTeamColor;
	private String awayTeamEmoji;
	private Double awayOdds;
	private Integer awayStrikes;
	private Double awayScore;
	private Integer awayTeamBatterCount;
	private String homePitcher;
	private String homePitcherName;
	private String homeBatter;
	private String homeBatterName;
	private String homeTeam;
	private String homeTeamName;
	private String homeTeamNickname;
	private String homeTeamColor;
	private String homeTeamEmoji;
	private Double homeOdds;
	private Integer homeStrikes;
	private Double homeScore;
	private Integer homeTeamBatterCount;
	private Integer season;
	private boolean isPostseason;
	private Integer day;
	private Integer phase;
	private boolean gameComplete;
	private boolean finalized;
	private boolean gameStart;
	private Integer halfInningOuts;
	private Double halfInningScore;
	private Integer inning;
	private boolean topOfInning;
	private Integer atBatBalls;
	private Integer atBatStrikes;
	private Integer seriesIndex;
	private Integer seriesLength;
	private boolean shame;
	private Integer weather;
	private Integer baserunnerCount;
	private Integer homeBases;
	private Integer awayBases;
	private Integer repeatCount;
	private String awayTeamSecondaryColor;
	private String homeTeamSecondaryColor;
	private Integer homeBalls;
	private Integer awayBalls;
	private Integer homeOuts;
	private Integer awayOuts;
	private Integer playCount;
	private Integer tournament;
	private String[] baseRunnerMods;
	private String homePitcherMod;
	private String homeBatterMod;
	private String awayPitcherMod;
	private String awayBatterMod;
	private String scoreUpdate;
	private String scoreLedger;
	private String stadiumId;
	private String secretBaserunner;
	private Double topInningScore;
	private Double bottomInningScore;
	private Integer newInningPhase;
	private Integer gameStartPhase;
	private boolean isTitleMatch;
	private String[] queuedEvents;
	private State state;
	private Integer endPhase;
	private Integer newHalfInningPhase;
	
	private static class State{}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getBasesOccupied() {
		return basesOccupied;
	}

	public void setBasesOccupied(String[] basesOccupied) {
		this.basesOccupied = basesOccupied;
	}

	public String[] getBaseRunners() {
		return baseRunners;
	}

	public void setBaseRunners(String[] baseRunners) {
		this.baseRunners = baseRunners;
	}

	public String[] getBaseRunnerNames() {
		return baseRunnerNames;
	}

	public void setBaseRunnerNames(String[] baseRunnerNames) {
		this.baseRunnerNames = baseRunnerNames;
	}

	public String[] getOutcomes() {
		return outcomes;
	}

	public void setOutcomes(String[] outcomes) {
		this.outcomes = outcomes;
	}

	public String getTerminology() {
		return terminology;
	}

	public void setTerminology(String terminology) {
		this.terminology = terminology;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getStatsheet() {
		return statsheet;
	}

	public void setStatsheet(String statsheet) {
		this.statsheet = statsheet;
	}

	public String getAwayPitcher() {
		return awayPitcher;
	}

	public void setAwayPitcher(String awayPitcher) {
		this.awayPitcher = awayPitcher;
	}

	public String getAwayPitcherName() {
		return awayPitcherName;
	}

	public void setAwayPitcherName(String awayPitcherName) {
		this.awayPitcherName = awayPitcherName;
	}

	public String getAwayBatter() {
		return awayBatter;
	}

	public void setAwayBatter(String awayBatter) {
		this.awayBatter = awayBatter;
	}

	public String getAwayBatterName() {
		return awayBatterName;
	}

	public void setAwayBatterName(String awayBatterName) {
		this.awayBatterName = awayBatterName;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getAwayTeamName() {
		return awayTeamName;
	}

	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}

	public String getAwayTeamNickname() {
		return awayTeamNickname;
	}

	public void setAwayTeamNickname(String awayTeamNickname) {
		this.awayTeamNickname = awayTeamNickname;
	}

	public String getAwayTeamColor() {
		return awayTeamColor;
	}

	public void setAwayTeamColor(String awayTeamColor) {
		this.awayTeamColor = awayTeamColor;
	}

	public String getAwayTeamEmoji() {
		return awayTeamEmoji;
	}

	public void setAwayTeamEmoji(String awayTeamEmoji) {
		this.awayTeamEmoji = awayTeamEmoji;
	}

	public Double getAwayOdds() {
		return awayOdds;
	}

	public void setAwayOdds(Double awayOdds) {
		this.awayOdds = awayOdds;
	}

	public Integer getAwayStrikes() {
		return awayStrikes;
	}

	public void setAwayStrikes(Integer awayStrikes) {
		this.awayStrikes = awayStrikes;
	}

	public Double getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(Double awayScore) {
		this.awayScore = awayScore;
	}

	public Integer getAwayTeamBatterCount() {
		return awayTeamBatterCount;
	}

	public void setAwayTeamBatterCount(Integer awayTeamBatterCount) {
		this.awayTeamBatterCount = awayTeamBatterCount;
	}

	public String getHomePitcher() {
		return homePitcher;
	}

	public void setHomePitcher(String homePitcher) {
		this.homePitcher = homePitcher;
	}

	public String getHomePitcherName() {
		return homePitcherName;
	}

	public void setHomePitcherName(String homePitcherName) {
		this.homePitcherName = homePitcherName;
	}

	public String getHomeBatter() {
		return homeBatter;
	}

	public void setHomeBatter(String homeBatter) {
		this.homeBatter = homeBatter;
	}

	public String getHomeBatterName() {
		return homeBatterName;
	}

	public void setHomeBatterName(String homeBatterName) {
		this.homeBatterName = homeBatterName;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getHomeTeamNickname() {
		return homeTeamNickname;
	}

	public void setHomeTeamNickname(String homeTeamNickname) {
		this.homeTeamNickname = homeTeamNickname;
	}

	public String getHomeTeamColor() {
		return homeTeamColor;
	}

	public void setHomeTeamColor(String homeTeamColor) {
		this.homeTeamColor = homeTeamColor;
	}

	public String getHomeTeamEmoji() {
		return homeTeamEmoji;
	}

	public void setHomeTeamEmoji(String homeTeamEmoji) {
		this.homeTeamEmoji = homeTeamEmoji;
	}

	public Double getHomeOdds() {
		return homeOdds;
	}

	public void setHomeOdds(Double homeOdds) {
		this.homeOdds = homeOdds;
	}

	public Integer getHomeStrikes() {
		return homeStrikes;
	}

	public void setHomeStrikes(Integer homeStrikes) {
		this.homeStrikes = homeStrikes;
	}

	public Double getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(Double homeScore) {
		this.homeScore = homeScore;
	}

	public Integer getHomeTeamBatterCount() {
		return homeTeamBatterCount;
	}

	public void setHomeTeamBatterCount(Integer homeTeamBatterCount) {
		this.homeTeamBatterCount = homeTeamBatterCount;
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public boolean isIsPostseason() {
		return isPostseason;
	}

	public void setIsPostseason(boolean isPostseason) {
		this.isPostseason = isPostseason;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getPhase() {
		return phase;
	}

	public void setPhase(Integer phase) {
		this.phase = phase;
	}

	public boolean isGameComplete() {
		return gameComplete;
	}

	public void setGameComplete(boolean gameComplete) {
		this.gameComplete = gameComplete;
	}

	public boolean isFinalized() {
		return finalized;
	}

	public void setFinalized(boolean finalized) {
		this.finalized = finalized;
	}

	public boolean isGameStart() {
		return gameStart;
	}

	public void setGameStart(boolean gameStart) {
		this.gameStart = gameStart;
	}

	public Integer getHalfInningOuts() {
		return halfInningOuts;
	}

	public void setHalfInningOuts(Integer halfInningOuts) {
		this.halfInningOuts = halfInningOuts;
	}

	public Double getHalfInningScore() {
		return halfInningScore;
	}

	public void setHalfInningScore(Double halfInningScore) {
		this.halfInningScore = halfInningScore;
	}

	public Integer getInning() {
		return inning;
	}

	public void setInning(Integer inning) {
		this.inning = inning;
	}

	public boolean isTopOfInning() {
		return topOfInning;
	}

	public void setTopOfInning(boolean topOfInning) {
		this.topOfInning = topOfInning;
	}

	public Integer getAtBatBalls() {
		return atBatBalls;
	}

	public void setAtBatBalls(Integer atBatBalls) {
		this.atBatBalls = atBatBalls;
	}

	public Integer getAtBatStrikes() {
		return atBatStrikes;
	}

	public void setAtBallStrikes(Integer atBatStrikes) {
		this.atBatStrikes = atBatStrikes;
	}

	public Integer getSeriesIndex() {
		return seriesIndex;
	}

	public void setSeriesIndex(Integer seriesIndex) {
		this.seriesIndex = seriesIndex;
	}

	public Integer getSeriesLength() {
		return seriesLength;
	}

	public void setSeriesLength(Integer seriesLength) {
		this.seriesLength = seriesLength;
	}

	public boolean isShame() {
		return shame;
	}

	public void setShame(boolean shame) {
		this.shame = shame;
	}

	public Integer getWeather() {
		return weather;
	}

	public void setWeather(Integer weather) {
		this.weather = weather;
	}

	public Integer getBaserunnerCount() {
		return baserunnerCount;
	}

	public void setBaserunnerCount(Integer baserunnerCount) {
		this.baserunnerCount = baserunnerCount;
	}

	public Integer getHomeBases() {
		return homeBases;
	}

	public void setHomeBases(Integer homeBases) {
		this.homeBases = homeBases;
	}

	public Integer getAwayBases() {
		return awayBases;
	}

	public void setAwayBases(Integer awayBases) {
		this.awayBases = awayBases;
	}

	public Integer getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(Integer repeatCount) {
		this.repeatCount = repeatCount;
	}

	public String getAwayTeamSecondaryColor() {
		return awayTeamSecondaryColor;
	}

	public void setAwayTeamSecondaryColor(String awayTeamSecondaryColor) {
		this.awayTeamSecondaryColor = awayTeamSecondaryColor;
	}

	public String getHomeTeamSecondaryColor() {
		return homeTeamSecondaryColor;
	}

	public void setHomeTeamSecondaryColor(String homeTeamSecondaryColor) {
		this.homeTeamSecondaryColor = homeTeamSecondaryColor;
	}

	public Integer getHomeBalls() {
		return homeBalls;
	}

	public void setHomeBalls(Integer homeBalls) {
		this.homeBalls = homeBalls;
	}

	public Integer getAwayBalls() {
		return awayBalls;
	}

	public void setAwayBalls(Integer awayBalls) {
		this.awayBalls = awayBalls;
	}

	public Integer getHomeOuts() {
		return homeOuts;
	}

	public void setHomeOuts(Integer homeOuts) {
		this.homeOuts = homeOuts;
	}

	public Integer getAwayOuts() {
		return awayOuts;
	}

	public void setAwayOuts(Integer awayOuts) {
		this.awayOuts = awayOuts;
	}

	public Integer getPlayCount() {
		return playCount;
	}

	public void setPlayCount(Integer playCount) {
		this.playCount = playCount;
	}

	public Integer getTournament() {
		return tournament;
	}

	public void setTournament(Integer tournament) {
		this.tournament = tournament;
	}

	public String[] getBaseRunnerMods() {
		return baseRunnerMods;
	}

	public void setBaseRunnerMods(String[] baseRunnerMods) {
		this.baseRunnerMods = baseRunnerMods;
	}

	public String getHomePitcherMod() {
		return homePitcherMod;
	}

	public void setHomePitcherMod(String homePitcherMod) {
		this.homePitcherMod = homePitcherMod;
	}

	public String getHomeBatterMod() {
		return homeBatterMod;
	}

	public void setHomeBatterMod(String homeBatterMod) {
		this.homeBatterMod = homeBatterMod;
	}

	public String getAwayPitcherMod() {
		return awayPitcherMod;
	}

	public void setAwayPitcherMod(String awayPitcherMod) {
		this.awayPitcherMod = awayPitcherMod;
	}

	public String getAwayBatterMod() {
		return awayBatterMod;
	}

	public void setAwayBatterMod(String awayBatterMod) {
		this.awayBatterMod = awayBatterMod;
	}

	public String getScoreUpdate() {
		return scoreUpdate;
	}

	public void setScoreUpdate(String scoreUpdate) {
		this.scoreUpdate = scoreUpdate;
	}

	public String getScoreLedger() {
		return scoreLedger;
	}

	public void setScoreLedger(String scoreLedger) {
		this.scoreLedger = scoreLedger;
	}

	public String getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(String stadiumId) {
		this.stadiumId = stadiumId;
	}

	public String getSecretBaserunner() {
		return secretBaserunner;
	}

	public void setSecretBaserunner(String secretBaserunner) {
		this.secretBaserunner = secretBaserunner;
	}

	public Double getTopInningScore() {
		return topInningScore;
	}

	public void setTopInningScore(Double topInningScore) {
		this.topInningScore = topInningScore;
	}

	public Double getBottomInningScore() {
		return bottomInningScore;
	}

	public void setBottomInningScore(Double bottomInningScore) {
		this.bottomInningScore = bottomInningScore;
	}

	public Integer getNewInningPhase() {
		return newInningPhase;
	}

	public void setNewInningPhase(Integer newInningPhase) {
		this.newInningPhase = newInningPhase;
	}

	public Integer getGameStartPhase() {
		return gameStartPhase;
	}

	public void setGameStartPhase(Integer gameStartPhase) {
		this.gameStartPhase = gameStartPhase;
	}

	public boolean isIsTitleMatch() {
		return isTitleMatch;
	}

	public void setIsTitleMatch(boolean isTitleMatch) {
		this.isTitleMatch = isTitleMatch;
	}

	public String[] getQueuedEvents() {
		return queuedEvents;
	}

	public void setQueuedEvents(String[] queuedEvents) {
		this.queuedEvents = queuedEvents;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getEndPhase() {
		return endPhase;
	}

	public void setEndPhase(Integer endPhase) {
		this.endPhase = endPhase;
	}

	public Integer getNewHalfInningPhase() {
		return newHalfInningPhase;
	}

	public void setNewHalfInningPhase(Integer newHalfInningPhase) {
		this.newHalfInningPhase = newHalfInningPhase;
	}
}
