/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clan;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Bao Dep Trai
 */
public class Clan {
    public int Id;
    public String Name;
    public int Level;
    public int numMem;
    public int maxMem;
    public int exp;
    public int maxExp;
    public int Rank;
    public int idIcon;
    public int trungSinh;
    public String nameCaption;
    public byte isLevelup;
    public int Ruby;
    public int Bery;
    public String strVoice;
    public byte trungsinh;
    public int cAction;
    public ClanAttribute Attribute;
    public ArrayList<ClanInfo> Info;
    public ArrayList<ClanChat> Chats;
    public ArrayList<ClanMember> Members;
    public Clan(String name, short icon){
        Id++;
        Name = name;
        Level = 1;
        numMem = 1;
        maxMem = 10;
        exp = 0;
        maxExp = 100;
        Rank++;
        idIcon = icon;
        trungsinh = 0;
        nameCaption = "HTTH SAO MAI DINH !";
        isLevelup = 0;
        Ruby = 0;
        Bery = 0;
        strVoice = "";
        trungsinh = 0;
        cAction = 0;
        Attribute = new ClanAttribute();
        Info = new ArrayList<ClanInfo>();
        Chats = new ArrayList<ClanChat>();
        Members = new ArrayList<ClanMember>();
        
    }
}
