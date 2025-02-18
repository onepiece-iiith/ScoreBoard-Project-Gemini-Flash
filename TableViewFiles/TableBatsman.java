package TableViewFiles;

public class TableBatsman {

    private BatsmanStats batsmanStats;
    private String outType;

    public TableBatsman(BatsmanStats batsmanStats, String outType) {
        this.batsmanStats = batsmanStats;
        this.outType = outType;
    }

    public BatsmanStats getBatsmanStats() {
        return batsmanStats;
    }

    public void setBatsmanStats(BatsmanStats batsmanStats) {
        this.batsmanStats = batsmanStats;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }
}

class BatsmanStats{
    private String playerName;
    private String batsmanRun;
    private String ballPlayed;
    private String fourRun;
    private String sixRun;
    private String strikeRate;

    public BatsmanStats(String playerName, String batsmanRun, String ballPlayed, String fourRun, String sixRun, String strikeRate) {
        this.playerName = playerName;
        this.batsmanRun = batsmanRun;
        this.ballPlayed = ballPlayed;
        this.fourRun = fourRun;
        this.sixRun = sixRun;
        this.strikeRate = strikeRate;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getBatsmanRun() {
        return batsmanRun;
    }

    public void setBatsmanRun(String batsmanRun) {
        this.batsmanRun = batsmanRun;
    }

    public String getBallPlayed() {
        return ballPlayed;
    }

    public void setBallPlayed(String ballPlayed) {
        this.ballPlayed = ballPlayed;
    }

    public String getFourRun() {
        return fourRun;
    }

    public void setFourRun(String fourRun) {
        this.fourRun = fourRun;
    }

    public String getSixRun() {
        return sixRun;
    }

    public void setSixRun(String sixRun) {
        this.sixRun = sixRun;
    }

    public String getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(String strikeRate) {
        this.strikeRate = strikeRate;
    }
}