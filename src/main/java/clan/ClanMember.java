/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clan;

import client.Player;

/**
 *
 * @author Administrator
 */
public class ClanMember {
    public short Lv;
    public int Id;
    public String Name;
    public short Head;
    public short Hair;
    public short Hat;
    public int gopRuby;
    public int conghien;
    public int numTangQua;
    public int cooldownTangQua;
    public int numQuest;
    public byte Role;
    public ClanMember(Player player, byte role){
       Lv = 0;
       Id = player.id;
       Name = player.name;
       Head = player.head;
       Hair = player.hair;
       Hat = 12;
       gopRuby = 0;
       conghien = 0;
       numTangQua = 0;
       cooldownTangQua = 0;
       numQuest = 0;
       Role = role;
    }
}
