package com.company;

import java.awt.event.MouseEvent;
import java.util.List;

public class Rules {
    public void horseRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        boolean op = true;
        int i,j,k;
        if(px-play.getX()>=0 && play.getX()-px<=57 && play.getY()-py>=57 && play.getY()-py<=114){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getX() == play.getX() && all[i].getY()- play.getY() == -57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY()-114,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(play.getX()-px>=0 && play.getX()-px<=57 && play.getY()-py>=57 && play.getY()-py<=114){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getX() == play.getX() && all[i].getY()- play.getY() == -57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY()-114,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(px-play.getX()>=0 && play.getX()-px<=57 && py-play.getY()>=114 && py-play.getY()<=170){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getX() == play.getX() && all[i].getY()- play.getY() == 57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY()+114,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(play.getX()-px>=0 && play.getX()-px<=57 && py-play.getY()>=114 && py-play.getY()<=170){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getX() == play.getX() && all[i].getY()- play.getY() == 57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY()+114,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(play.getX()-px>=0 && play.getX()-px<=114 && play.getY()-py>=0 && play.getY()-py<=57){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getY() == play.getY() && all[i].getX()- play.getX() == -57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-114,play.getY()-57,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(play.getX()-px>=0 && play.getX()-px<=114 && py-play.getY()>=57 && py-play.getY()<=114){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getY() == play.getY() && all[i].getX()- play.getX() == -57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-114,play.getY()+57,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(px-play.getX()>=114 && px-play.getX()<=170 && play.getY()-py>=0 && play.getY()-py<=57){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getY() == play.getY() && all[i].getX()- play.getX() == 57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+114,play.getY()-57,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(px-play.getX()>=114 && px-play.getX()<=170 && py-play.getY()>=57 && py-play.getY()<=114){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getY() == play.getY() && all[i].getX()- play.getX() == 57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+114,play.getY()+57,55,55);
                play.PlaySounds();
                return;
            }
        }

    }
    public void cannonRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        int count = 0;
        int i,j,k;
        if(px-play.getX()>=0 && px-play.getX()<57){
            for(i=56;i<=569;i+=57){
                if(py-i>=0 && py-i<57){
                    for(j=0;j<32;j++){
                        if(all[j].getX() == play.getX() && !all[j].death && play.getName() != all[j].getName()){
                            for(k=i;k<play.getY();k+=57){
                                if(all[j].getY() == k){
                                    count++;
                                }
                            }
                            for(k=play.getY();k<i;k+=57){
                                if(all[j].getY() == k){
                                    count++;
                                }
                            }
                        }
                    }
                    if(count == 0){
                        ChessRegret regret= new ChessRegret();
                        regret.judge = judge;
                        regret.px = play.getX();
                        regret.py = play.getY();
                        chessRegretList.add(regret);
                        play.setBounds(play.getX(),i,55,55);
                        play.PlaySounds();
                        return;
                    }
                }
            }
        }
        if(py-play.getY()>=0 && py-play.getY()<57){
            for(i=24;i<=480;i+=57){
                if(px-i>=0 && px-i<57){
                    for(j=0;j<32;j++){
                        if(all[j].getY() == play.getY() && !all[j].death && play.getName() != all[j].getName()){
                            for(k=i;k<play.getX();k+=57){
                                if(all[j].getX() == k){
                                    count++;
                                }
                            }
                            for(k=play.getX();k<i;k+=57){
                                if(all[j].getX() == k){
                                    count++;
                                }
                            }
                        }
                    }
                    if(count == 0){
                        ChessRegret regret= new ChessRegret();
                        regret.judge = judge;
                        regret.px = play.getX();
                        regret.py = play.getY();
                        chessRegretList.add(regret);
                        play.setBounds(i,play.getY(),55,55);
                        play.PlaySounds();
                        return;
                    }
                }
            }
        }
    }
    public void carRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        int count = 0;
        int i,j,k;
        if(px-play.getX()>=0 && px-play.getX()<57){
            for(i=56;i<=569;i+=57){
                if(py-i>=0 && py-i<57){
                    for(j=0;j<32;j++){
                        if(all[j].getX() == play.getX() && !all[j].death && play.getName() != all[j].getName()){
                            for(k=i;k<play.getY();k+=57){
                                if(all[j].getY() == k){
                                    count++;
                                }
                            }
                            for(k=play.getY();k<i;k+=57){
                                if(all[j].getY() == k){
                                    count++;
                                }
                            }
                        }
                    }
                    if(count == 0){
                        ChessRegret regret= new ChessRegret();
                        regret.judge = judge;
                        regret.px = play.getX();
                        regret.py = play.getY();
                        chessRegretList.add(regret);
                        play.setBounds(play.getX(),i,55,55);
                        play.PlaySounds();
                        return;
                    }
                }
            }
        }
        if(py-play.getY()>=0 && py-play.getY()<57){
            for(i=24;i<=480;i+=57){
                if(px-i>=0 && px-i<57){
                    for(j=0;j<32;j++){
                        if(all[j].getY() == play.getY() && !all[j].death && play.getName() != all[j].getName()){
                            for(k=i;k<play.getX();k+=57){
                                if(all[j].getX() == k){
                                    count++;
                                }
                            }
                            for(k=play.getX();k<i;k+=57){
                                if(all[j].getX() == k){
                                    count++;
                                }
                            }
                        }
                    }
                    if(count == 0){
                        ChessRegret regret= new ChessRegret();
                        regret.judge = judge;
                        regret.px = play.getX();
                        regret.py = play.getY();
                        chessRegretList.add(regret);
                        play.setBounds(i,play.getY(),55,55);
                        play.PlaySounds();
                        return;
                    }
                }
            }
        }
    }
    public void eleRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        boolean op = true;
        int i,j,k;
        if(play.getY()<=286 && py >= 341){
                return;
        }
        else if(play.getY()>=341 && py <= 286){
            return;
        }
        else if(play.getX()-px>=57 && play.getX()-px<=114 && play.getY()-py>=57 && play.getY()-py<=114){
            for ( i = 0; i < 32; i++) {
                if(!all[i].death && all[i].getX()-play.getX()==-57 && all[i].getY()-play.getY() == -57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-114,play.getY()-114,55,55);
                play.PlaySounds();
                return;
            }
        }
        else if(px-play.getX()>=114 && px-play.getX()<=170 && play.getY()-py>=57 && play.getY()-py<=114){
            for ( i = 0; i < 32; i++) {
                if(!all[i].death && all[i].getX()-play.getX()==57 && all[i].getY()-play.getY() == -57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+114,play.getY()-114,55,55);
                play.PlaySounds();
                return;
            }

        }
        else if(play.getX()-px>=57 && play.getX()-px<=114 && py-play.getY()>=114 && py-play.getY()<=170){
            for ( i = 0; i < 32; i++) {
                if(!all[i].death && all[i].getX()-play.getX()==-57 && all[i].getY()-play.getY() == 57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-114,play.getY()+114,55,55);
                play.PlaySounds();
                return;
            }

        }
        else if(px-play.getX()>=114 && px-play.getX()<=170 && py-play.getY()>=114 && py-play.getY()<=170){
            for ( i = 0; i < 32; i++) {
                if(!all[i].death && all[i].getX()-play.getX()==57 && all[i].getY()-play.getY() == 57){
                    op = false;
                    break;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+114,play.getY()+114,55,55);
                play.PlaySounds();
                return;
            }

        }
    }
    public void chapRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        int i,j,k;
        if(px-play.getX()>=57 && px-play.getX()<=114 && play.getY()-py>=0 && play.getY()-py<=57){
            if(play.getY()<300 && play.getX()+57>=252 && play.getX()+57<=309){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY()-57,55,55);
                play.PlaySounds();
            }
            else if(play.getY()>300 && play.getX()+57>=252 && play.getX()+57<=309 && play.getY()-57>=455 && play.getY()-57<=512){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    chessRegretList.add(regret);
                    play.setBounds(play.getX()+57,play.getY()-57,55,55);
                    play.PlaySounds();
            }
        }
        else if(px-play.getX()>=57 && px-play.getX()<=114 && py-play.getY()>=0 && py-play.getY()<=114){
            if(play.getY()<300 && play.getX()+57>=252 && play.getX()+57<=309){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY()+57,55,55);
                play.PlaySounds();
            }
            else if(play.getY()>300 && play.getX()+57>=252 && play.getX()+57<=309 && play.getY()+57>=512 && play.getY()+57<=569){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    chessRegretList.add(regret);
                    play.setBounds(play.getX()+57,play.getY()+57,55,55);
                    play.PlaySounds();
                }
        }
        else if(play.getX()-px>=0 && play.getX()-px<=57 && play.getY()-py>=0 && play.getY()-py<=57){
            if(play.getY()<300 && play.getX()-57>=195 && play.getX()-57<=252){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY()-57,55,55);
                play.PlaySounds();
            }
            else if(play.getY()>300 && play.getY()-57>=455 && play.getY()-57<=512){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY()-57,55,55);
                play.PlaySounds();
            }
        }
        else if(px-play.getX()>=0 && px-play.getX()<=57 && py-play.getY()>=0 && py-play.getY()<=114){
            if(play.getY()<300 && play.getX()-57>=195 && play.getX()-57<=252){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY()+57,55,55);
                play.PlaySounds();
            }
            else if(play.getY()>300 && play.getY()+57>=512 && play.getY()+57<=569 && play.getX() <= 309 && play.getX()>=252){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY()+57,55,55);
                play.PlaySounds();
            }
        }
    }
    public void bossRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        boolean op = true;
        int i,j,k;
        if(px-play.getX()>=0 && px-play.getX()<=57 && play.getY()-py>=0 && play.getY()-py<=57){
            if((play.getX() == 195 || play.getX() == 252 || play.getX() == 309) && (play.getY()==113 || play.getY()==170)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX(),play.getY()-57,55,55);
                play.PlaySounds();
            }
            else if((play.getX() == 195 || play.getX() == 252 || play.getX() == 309) && (play.getY()==512 || play.getY()==569)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX(),play.getY()-57,55,55);
                play.PlaySounds();
            }
        }
        else if(px-play.getX()>=0 && px-play.getX()<=57 && py-play.getY()>=57 && py-play.getY()-py<=114){
            if((play.getX() == 195 || play.getX() == 252 || play.getX() == 309) && (play.getY()==113 || play.getY()==56)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX(),play.getY()+57,55,55);
                play.PlaySounds();
            }
            else if((play.getX() == 195 || play.getX() == 252 || play.getX() == 309) && (play.getY()==512 || play.getY()==455)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX(),play.getY()+57,55,55);
                play.PlaySounds();
            }
        }
        else if(px-play.getX()>=-57 && px-play.getX()<=0 && py-play.getY()>=0 && py-play.getY()-py<=57){
            if((play.getX() == 252 || play.getX() == 309) && (play.getY()==170 || play.getY()==113 || play.getY()==56)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY(),55,55);
                play.PlaySounds();
            }
            else if(( play.getX() == 252 || play.getX() == 309) && (play.getY()==512 || play.getY()==455 || play.getY()==569)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY(),55,55);
                play.PlaySounds();
            }
        }
        else if(px-play.getX()>=57 && px-play.getX()<=114 && py-play.getY()>=0 && py-play.getY()-py<=57){
            if((play.getX() == 195 || play.getX() == 252) && (play.getY()==170 || play.getY()==113 || play.getY()==56)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY(),55,55);
                play.PlaySounds();
            }
            else if((play.getX() == 195 || play.getX() == 252) && (play.getY()==512 || play.getY()==455 || play.getY()==569)){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY(),55,55);
                play.PlaySounds();
            }
        }
    }
    public void soliderRule(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge){
        int px = me.getX();
        int py = me.getY() + 30;
        boolean op = false;
        int i,j,k;
        if(play.getName().charAt(0) == '红'){
            op = true;
        }
        if(!op){
            if(px-play.getX()>=0 && px-play.getX()<=57 && py-play.getY() >= 57 && py-play.getY() <= 114){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX(),play.getY()+57,55,55);
                play.PlaySounds();
            }
            else if (play.getY()>=341 && px-play.getX()>=57 && px-play.getX()<=114 && py-play.getY() >= 0 && py-play.getY() <= 57){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY(),55,55);
                play.PlaySounds();
            }
            else if (play.getY()>=341 && px-play.getX()>=-57 && px-play.getX()<=0 && py-play.getY() >= 0 && py-play.getY() <= 57){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY(),55,55);
                play.PlaySounds();
            }
        }
        else{
            if(px-play.getX()>=0 && px-play.getX()<=57 && py-play.getY() >= -57 && py-play.getY() <= 0){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX(),play.getY()-57,55,55);
                play.PlaySounds();
            }
            else if (play.getY()<=284 && px-play.getX()>=57 && px-play.getX()<=114 && py-play.getY() >= 0 && py-play.getY() <= 57){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()+57,play.getY(),55,55);
                play.PlaySounds();
            }
            else if (play.getY()<=284 && px-play.getX()>=-57 && px-play.getX()<=0 && py-play.getY() >= 0 && py-play.getY() <= 57){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                chessRegretList.add(regret);
                play.setBounds(play.getX()-57,play.getY(),55,55);
                play.PlaySounds();
            }
        }
    }
    public void carEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        int count = 0;
        int i;
        int j;
        ChessRegret regret = new ChessRegret();
        if (play.getX() == eat.getX()) {
            for(i = 0; i < 32; ++i) {
                if (play.getY() < eat.getY()) {
                    for(j = play.getY() + 57; j < eat.getY(); j += 57) {
                        if (all[i].getX() == play.getX() && all[i].getY() == j && !all[i].death) {
                            ++count;
                        }
                    }
                } else {
                    for(j = eat.getY() + 57; j < play.getY(); j += 57) {
                        if (all[i].getX() == play.getX() && all[i].getY() == j && !all[i].death) {
                            ++count;
                        }
                    }
                }
            }

            if (count == 0) {
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);
                play.PlaySounds();
                eat.eatSounds();
            }
        }

        if (play.getY() == eat.getY()) {
            for(i = 0; i < 32; ++i) {
                if (play.getX() > eat.getX()) {
                    for(j = eat.getX() + 57; j < play.getX(); j += 57) {
                        if (all[i].getY() == play.getY() && all[i].getX() == j && !all[i].death) {
                            ++count;
                        }
                    }
                } else {
                    for(j = play.getX()+ 57; j < eat.getX(); j += 57) {
                        if (all[i].getY() == play.getY() && all[i].getX() == j && !all[i].death) {
                            ++count;
                        }
                    }
                }
            }

            if (count == 0) {
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);
                play.PlaySounds();
                eat.eatSounds();
            }
        }

    }
    public void cannonEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        int count = 0;
        int i;
        int j;
        ChessRegret regret = new ChessRegret();
        if (play.getX() == eat.getX()) {
            for(i = 0; i < 32; ++i) {
                if (play.getY() < eat.getY()) {
                    for(j = play.getY() + 57; j < eat.getY(); j += 57) {
                        if (all[i].getX() == play.getX() && all[i].getY() == j && !all[i].death) {
                            ++count;
                        }
                    }
                } else {
                    for(j = eat.getY() + 57; j < play.getY(); j += 57) {
                        if (all[i].getX() == play.getX() && all[i].getY() == j && !all[i].death) {
                            ++count;
                        }
                    }
                }
            }

            if (count == 1) {
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);
                play.PlaySounds();
                eat.eatSounds();
            }
        }

        else if (play.getY() == eat.getY()) {
            for(i = 0; i < 32; ++i) {
                if (play.getX() > eat.getX()) {
                    for(j = eat.getX() + 57; j < play.getX(); j += 57) {
                        if (all[i].getY() == play.getY() && all[i].getX() == j && !all[i].death) {
                            ++count;
                        }
                    }
                } else {
                    for(j = play.getX()+ 57; j < eat.getX(); j += 57) {
                        if (all[i].getY() == play.getY() && all[i].getX() == j && !all[i].death) {
                            ++count;
                        }
                    }
                }
            }

            if (count == 1) {
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);
                play.PlaySounds();
                eat.eatSounds();
            }
        }

    }
    public void horseEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        boolean op=true;
        int i,j,k;
        if((play.getX()-57==eat.getX() || play.getX()+57==eat.getX()) && play.getY()-114 == eat.getY()){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getX() == play.getX() && play.getY()-57 == all[i].getY()){
                    op=false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
        else if((play.getX()-57==eat.getX() || play.getX()+57==eat.getX()) && play.getY()+114 == eat.getY()){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getX() == play.getX() && play.getY()+57 == all[i].getY()){
                    op=false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
        else if((play.getY()-57==eat.getX() || play.getY()+57==eat.getX()) && play.getX()-114 == eat.getX()){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getY() == play.getY() && play.getX()-57 == all[i].getX()){
                    op=false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
        else if((play.getY()-57==eat.getX() || play.getY()+57==eat.getX()) && play.getX()+114 == eat.getX()){
            for(i=0;i<32;i++){
                if(!all[i].death && all[i].getY() == play.getY() && play.getX()+57 == all[i].getX()){
                    op=false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
    }
    public void eleEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        boolean op=true;
        int i,j,k;
        if(play.getY()<=286 && eat.getY() >= 341){
            return;
        }
        else if(play.getY()>=341 && eat.getY() <= 286){
            return;
        }
        else if(play.getX()-114==eat.getX() && play.getY()-114==eat.getY()){
            for(i=0;i<32;i++){
                if(play.getX()-57 == all[i].getX() && play.getY()-57 == all[i].getY()){
                    op =false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
        else if(play.getX()+114==eat.getX() && play.getY()-114==eat.getY()){
            for(i=0;i<32;i++){
                if(play.getX()+57 == all[i].getX() && play.getY()-57 == all[i].getY()){
                    op =false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
        else if(play.getX()-114==eat.getX() && play.getY()+114==eat.getY()){
            for(i=0;i<32;i++){
                if(play.getX()-57 == all[i].getX() && play.getY()+57 == all[i].getY()){
                    op =false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
        else if(play.getX()+114==eat.getX() && play.getY()+114==eat.getY()){
            for(i=0;i<32;i++){
                if(play.getX()+57 == all[i].getX() && play.getY()+57 == all[i].getY()){
                    op =false;
                }
            }
            if(op){
                ChessRegret regret= new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat=eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(),eat.getY(),55,55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
    }
    public void chapEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        boolean op=true;
        int i,j,k;
        if(play.getX()-57 == eat.getX() && play.getY()-57 == eat.getY()){
            if(play.getY()<300){
                if((eat.getX() == 195 && eat.getY() == 56) || (eat.getX() == 252 && eat.getY() == 113)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if((eat.getX() == 195 && eat.getY() == 455) || (eat.getX() == 252 && eat.getY() == 512)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
        else if(play.getX()+57 == eat.getX() && play.getY()-57 == eat.getY()){
            if(play.getY()<300){
                if((eat.getX() == 309 && eat.getY() == 56) || (eat.getX() == 252 && eat.getY() == 113)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if((eat.getX() == 309 && eat.getY() == 455) || (eat.getX() == 252 && eat.getY() == 512)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
        else if(play.getX()-57 == eat.getX() && play.getY()+57 == eat.getY()){
            if(play.getY()<300){
                if((eat.getX() == 195 && eat.getY() == 170) || (eat.getX() == 252 && eat.getY() == 113)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if((eat.getX() == 195 && eat.getY() == 569) || (eat.getX() == 252 && eat.getY() == 512)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
        else if(play.getX()+57 == eat.getX() && play.getY()+57 == eat.getY()){
            if(play.getY()<300){
                if((eat.getX() == 309 && eat.getY() == 170) || (eat.getX() == 252 && eat.getY() == 113)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if((eat.getX() == 309 && eat.getY() == 569) || (eat.getX() == 252 && eat.getY() == 512)){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);
                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
    }
    public void bossEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        boolean op=true;
        int i,j,k;
        if(play.getX()-57 == eat.getX() && play.getY() == eat.getY()){
            if(play.getY()<300){
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=56 && eat.getY()<=170){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=455 && eat.getY()<=569){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
        else if(play.getX()+57 == eat.getX() && play.getY() == eat.getY()){
            if(play.getY()<300){
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=56 && eat.getY()<=170){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=455 && eat.getY()<=569){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
        else if(play.getX() == eat.getX() && play.getY()+57 == eat.getY()){
            if(play.getY()<300){
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=56 && eat.getY()<=170){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=455 && eat.getY()<=569){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
        else if(play.getX() == eat.getX() && play.getY()-57 == eat.getY()){
            if(play.getY()<300){
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=56 && eat.getY()<=170){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
            else{
                if(eat.getX()<=305 && eat.getX()>=195 && eat.getY()>=455 && eat.getY()<=569){
                    ChessRegret regret= new ChessRegret();
                    regret.judge = judge;
                    regret.px = play.getX();
                    regret.py = play.getY();
                    regret.eatY= eat.getY();
                    regret.eatX = eat.getX();
                    regret.eat=eatNumber;
                    chessRegretList.add(regret);
                    eat.setVisible(false);
                    eat.beDead();
                    play.setBounds(eat.getX(),eat.getY(),55,55);

                    play.eatSounds();
                    play.PlaySounds();
                }
            }
        }
    }
    public void soliderEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ) {
        boolean op = false;
        int i, j, k;
        if (play.getName().charAt(0) == '红') {
            op = true;
        }
        if (!op) {
            if (play.getY() + 57 == eat.getY() && play.getX() == eat.getX()) {
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
            else if (play.getY() > 300 && play.getY() == eat.getY() && play.getX() - 57 == eat.getX()) {
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
            else if (play.getY() > 300 && play.getY() == eat.getY() && play.getX() + 57 == eat.getX()) {
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
        } else {
            if (play.getY() - 57 == eat.getY() && play.getX() == eat.getX()) {
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
            else if (play.getY() < 300 && play.getY() == eat.getY() && play.getX() - 57 == eat.getX()) {
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
            else if (play.getY() < 300 && play.getY() == eat.getY() && play.getX() + 57 == eat.getX()) {
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
    }
    public void faceEat(Chess play, Chess[] all, MouseEvent me, List<ChessRegret> chessRegretList , int judge,Chess eat,int eatNumber ){
        int i, j, k;
        int op=0;
        int x= play.getX();
        if(play.getX()!=eat.getX()){
            return;
        }
        else if((judge == 30 & eatNumber == 31) || (judge == 31 & eatNumber == 30)){
            for(i=all[30].getY()+57;i<all[31].getY();i+=57){
                for(j=0;j<32;j++){
                    if(all[j].getX() == x && !all[j].death){
                        op++;
                    }
                }
            }
            if(op==0){
                ChessRegret regret = new ChessRegret();
                regret.judge = judge;
                regret.px = play.getX();
                regret.py = play.getY();
                regret.eatY= eat.getY();
                regret.eatX = eat.getX();
                regret.eat = eatNumber;
                chessRegretList.add(regret);
                eat.setVisible(false);
                eat.beDead();
                play.setBounds(eat.getX(), eat.getY(), 55, 55);

                play.eatSounds();
                play.PlaySounds();
            }
        }
    }
}
