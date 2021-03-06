package Model;

public class Base {
    private String base_uuid;
    private String user_name="";
    private int user_level;
    private int coin;
    private int diamond;
    private int exp;
    private int wood;
    private int iron;
    private int wheat;

    public Base(String base_uuid, String user_name, int user_level, int coin, int diamond, int exp, int wood, int iron, int wheat) {
        this.base_uuid = base_uuid;
        this.user_name = user_name;
        this.user_level = user_level;
        this.coin = coin;
        this.diamond = diamond;
        this.exp=exp;
        this.wood=wood;
        this.iron=iron;
        this.wheat=wheat;
    }

    public String getUsername() {
        return user_name;
    }

    public void setUsername(String username) {
        this.user_name = username;
    }

    public int getExp() {
        return exp;
    }

    public String getBaseId() {
        return base_uuid;
    }

    public void setBaseId(String base_uuid) {
        this.base_uuid = base_uuid;
    }

    public int getUserLevel() {
        return user_level;
    }

    public void setUserLevel(int userlevel) {
        this.user_level = userlevel;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getWood(){return wood;}

    public void setWood(int wood){this.wood = wood;}

    public int getIron(){return iron;}

    public void setIron(int iron){this.iron=iron;}

    public int getWheat(){return wheat;}

    public void setWheat(int wheat){this.wheat = wheat;}
}
