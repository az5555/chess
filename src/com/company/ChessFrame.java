package com.company;




import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ChessFrame extends JFrame implements ActionListener, MouseListener,Runnable{
    int ChessPlayJudge = 0 ;
    static int judge;
    boolean gameOver = false;
    Rules rules = new Rules();
    List<ChessRegret> regretList = new ArrayList<ChessRegret>();
    boolean CheckMouse;
    Thread tmain;
    Chess play[] = new Chess[33];
    JLabel ChessBoard;
    JLabel text;
    Container con;
    JToolBar tool;
    JToolBar lowBar;
    JButton high;
    JButton low;
    JButton mid;
    JButton NewGame;
    JButton repent;
    JButton exit;
    public ChessFrame(String title){
        con = this.getContentPane();
        con.setLayout(null);
        this.setTitle(title);
        tool = new JToolBar();
        lowBar = new JToolBar();
        text = new JLabel("java中国象棋");
        text.setToolTipText("信息提示");
        NewGame = new JButton("新游戏");
        NewGame.setToolTipText("重新开始新的一局");
        low = new JButton("低难度");
        low.setToolTipText("遍历");
        high = new JButton("高难度");
        high.setToolTipText("遍历");
        repent = new JButton("悔棋");
        repent.setToolTipText("悔棋");
        mid = new JButton("中难度");
        mid.setToolTipText("遍历");
        exit = new JButton("退出");
        exit.setToolTipText("退出java象棋");
        tool.setLayout(new GridLayout(0,3));
        tool.add(NewGame);
        tool.add(repent);
        tool.add(exit);
        tool.add(low);
        tool.add(mid);
        tool.add(high);
        lowBar.setLayout(new GridLayout(0,1));
        lowBar.add(text);
        tool.setBounds(0,0,553,38);
        con.add(tool);
        lowBar.setBounds(0,620,553,38);
        con.add(lowBar);
        DrawBoard();
        int i;
        for (i = 0; i < 32; i++) {
            con.add(play[i]);
            play[i].addMouseListener(this);
        }
        ChessBoard = new JLabel(new ImageIcon("image/main.gif"));
        con.add(ChessBoard);
        ChessBoard.setBounds(0,30,558,620);
        ChessBoard.addMouseListener(this);
        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(ScreenSize.width/2-280,ScreenSize.height/2-350);
        this.setIconImage(new ImageIcon("image/红将.gif").getImage());
        this.setResizable(false);
        this.setSize(558,688);
        this.setVisible(true);
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });
        NewGame.addActionListener(this);
        repent.addActionListener(this);
        exit.addActionListener(this);
        high.addActionListener(this);
        low.addActionListener(this);
        mid.addActionListener(this);

    }
    public void reset(){
        play[0].setBounds(24,56,55,55);
        play[1].setBounds(480,56,55,55);
        play[4].setBounds(81,56,55,55);
        play[5].setBounds(423,56,55,55);
        play[8].setBounds(138,56,55,55);
        play[9].setBounds(366,56,55,55);
        play[12].setBounds(195,56,55,55);
        play[13].setBounds(309,56,55,55);
        int i,j;
        for(i=16,j=24;i<21;i++,j+=114){
            play[i].setBounds(j,227,55,55);
        }
        play[26].setBounds(81,170,55,55);
        play[27].setBounds(423,170,55,55);
        play[30].setBounds(252,56,55,55);
        play[2].setBounds(24,569,55,55);
        play[3].setBounds(480,569,55,55);
        play[6].setBounds(81,569,55,55);
        play[7].setBounds(423,569,55,55);
        play[10].setBounds(138,569,55,55);
        play[11].setBounds(366,569,55,55);
        play[14].setBounds(195,569,55,55);
        play[15].setBounds(309,569,55,55);
        for(i=21,j=24;i<26;i++,j+=114){
            play[i].setBounds(j,398,55,55);
        }
        play[28].setBounds(81,455,55,55);
        play[29].setBounds(423,455,55,55);
        play[31].setBounds(252,569,55,55);
        for(i=0;i<32;i++){
            play[i].reset();
            play[i].setVisible(true);
        }
        text.setText("红方");
        judge = 32;
        ChessPlayJudge = 0;
        regretList.clear();
    }
    public void DrawBoard(){
        Icon in = new ImageIcon("image/黑车.gif");
        play[0] = new Chess(in);
        play[0].setBounds(24,56,55,55);
        play[0].setName("黑车");
        play[1] = new Chess(in);
        play[1].setBounds(480,56,55,55);
        play[1].setName("黑车");
        in = new ImageIcon("image/黑马.gif");
        play[4] = new Chess(in);
        play[4].setBounds(81,56,55,55);
        play[4].setName("黑马");
        play[5] = new Chess(in);
        play[5].setBounds(423,56,55,55);
        play[5].setName("黑马");
        in = new ImageIcon("image/黑象.gif");
        play[8] = new Chess(in);
        play[8].setBounds(138,56,55,55);
        play[8].setName("黑象");
        play[9] = new Chess(in);
        play[9].setBounds(366,56,55,55);
        play[9].setName("黑象");
        in = new ImageIcon("image/黑士.gif");
        play[12] = new Chess(in);
        play[12].setBounds(195,56,55,55);
        play[12].setName("黑士");
        play[13] = new Chess(in);
        play[13].setBounds(309,56,55,55);
        play[13].setName("黑士");

        int i,j;
        in = new ImageIcon("image/黑卒.gif");
        for(i=16,j=24;i<21;i++,j+=114){
            play[i] = new Chess(in);
            play[i].setBounds(j,227,55,55);
            play[i].setName("黑士");
        }
        in = new ImageIcon("image/黑炮.gif");
        play[26] = new Chess(in);
        play[26].setBounds(81,170,55,55);
        play[26].setName("黑炮");
        play[27] = new Chess(in);
        play[27].setBounds(423,170,55,55);
        play[27].setName("黑炮");
        in = new ImageIcon("image/黑将.gif");
        play[30] = new Chess(in);
        play[30].setBounds(252,56,55,55);
        play[30].setName("黑将");


        in = new ImageIcon("image/红车.gif");
        play[2] = new Chess(in);
        play[2].setBounds(24,569,55,55);
        play[2].setName("红车");
        play[3] = new Chess(in);
        play[3].setBounds(480,569,55,55);
        play[3].setName("红车");
        in = new ImageIcon("image/红马.gif");
        play[6] = new Chess(in);
        play[6].setBounds(81,569,55,55);
        play[6].setName("红马");
        play[7] = new Chess(in);
        play[7].setBounds(423,569,55,55);
        play[7].setName("红马");
        in = new ImageIcon("image/红象.gif");
        play[10] = new Chess(in);
        play[10].setBounds(138,569,55,55);
        play[10].setName("红象");
        play[11] = new Chess(in);
        play[11].setBounds(366,569,55,55);
        play[11].setName("红象");
        in = new ImageIcon("image/红士.gif");
        play[14] = new Chess(in);
        play[14].setBounds(195,569,55,55);
        play[14].setName("红士");
        play[15] = new Chess(in);
        play[15].setBounds(309,569,55,55);
        play[15].setName("红士");

        in = new ImageIcon("image/红卒.gif");
        for(i=21,j=24;i<26;i++,j+=114){
            play[i] = new Chess(in);
            play[i].setBounds(j,398,55,55);
            play[i].setName("红士");
        }
        in = new ImageIcon("image/红炮.gif");
        play[28] = new Chess(in);
        play[28].setBounds(81,455,55,55);
        play[28].setName("红炮");
        play[29] = new Chess(in);
        play[29].setBounds(423,455,55,55);
        play[29].setName("红炮");
        in = new ImageIcon("image/红将.gif");
        play[31] = new Chess(in);
        play[31].setBounds(252,569,55,55);
        play[31].setName("红将");
        play[32] = new Chess(in);
        play[32].setName("111");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(NewGame)){
        reset();
    }
    if(e.getSource().equals(repent)){
        if(regretList.isEmpty()){
            JOptionPane.showMessageDialog(this,"你干嘛");
            try{
                Clip clip = AudioSystem.getClip();
                File file = new File("sounds/你干嘛.wav");
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                clip.open(audioInput);
                clip.start();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        else{
            ChessRegret chessRegret=regretList.get(regretList.size()-1);
            judge=chessRegret.judge;
            play[judge].setBounds(chessRegret.px,chessRegret.py,55,55);
            if(chessRegret.eat!=-1){
                play[chessRegret.eat].setVisible(true);
                play[chessRegret.eat].reset();;
                play[chessRegret.eat].setBounds(chessRegret.eatX,chessRegret.eatY,55,55);
            }
            if(ChessPlayJudge==1){
                ChessPlayJudge=0;
                text.setText("红棋走棋");
            }
            else {
                ChessPlayJudge=1;
                text.setText("黑棋走棋");
            }
            regretList.remove(regretList.size()-1);
        }
    }
    if(e.getSource().equals(exit)){
        int j=JOptionPane.showConfirmDialog(this,"确认退出吗？","退出",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(j!=JOptionPane.YES_NO_CANCEL_OPTION){
            System.exit(0);
        }
        System.out.println("0");
    }
    if(e.getSource().equals(high)){
        JOptionPane.showMessageDialog(this,"高难度（还未实现）");
    }
        if(e.getSource().equals(mid)){
            JOptionPane.showMessageDialog(this,"中难度（还未实现）");
        }
        if(e.getSource().equals(low)){
            JOptionPane.showMessageDialog(this,"低难度（还未实现）");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int op = 32;
        int ex = 0;
        int ey = 0;
        if(tmain == null){
            tmain = new Thread(this);
            tmain.start();
        }
        if(gameOver){
            return;
        }
        if(e.getSource().equals(ChessBoard)){
            if(ChessPlayJudge==0 && play[judge].getName().charAt(0)=='红'){
                ex=play[judge].getX();
                ey=play[judge].getY();
                if(judge>=0 && judge<4){
                    System.out.println("移动红车");
                    rules.carRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=4 && judge<8){
                    System.out.println("移动红马");
                    rules.horseRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=8 && judge<12){
                    System.out.println("移动红象");
                    rules.eleRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=12 && judge<16){
                    System.out.println("移动红士");
                    rules.chapRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=16 && judge<26){
                    System.out.println("移动红兵");
                    rules.soliderRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=26 && judge<30){
                    System.out.println("移动红炮");
                    rules.cannonRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=30 && judge<32){
                    System.out.println("移动红帅");
                    rules.bossRule(play[judge],play,e,regretList,judge);
                }
                if(ex==play[judge].getX() && ey==play[judge].getY()){
                    text.setText("无效点击，红棋走棋");
                    ChessPlayJudge=0;
                }
                else{
                    text.setText("黑棋走棋");
                    ChessPlayJudge=1;
                    CheckMouse=false;
                }
            }
            if(ChessPlayJudge==1 && play[judge].getName().charAt(0)=='黑'){
                ex=play[judge].getX();
                ey=play[judge].getY();
                if(judge>=0 && judge<4){
                    System.out.println("移动黑车");
                    rules.carRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=4 && judge<8){
                    System.out.println("移动黑马");
                    rules.horseRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=8 && judge<12){
                    System.out.println("移动黑象");
                    rules.eleRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=12 && judge<16){
                    System.out.println("移动黑士");
                    rules.chapRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=16 && judge<26){
                    System.out.println("移动黑兵");
                    rules.soliderRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=26 && judge<30){
                    System.out.println("移动黑炮");
                    rules.cannonRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=30 && judge<32){
                    System.out.println("移动黑帅");
                    rules.bossRule(play[judge],play,e,regretList,judge);
                }
                if(ex==play[judge].getX() && ey==play[judge].getY()){
                    text.setText("无效点击，黑棋走棋");
                    ChessPlayJudge=1;
                }
                else{
                    text.setText("红棋走棋");
                    ChessPlayJudge=0;
                    CheckMouse=false;
                }
            }
        }
        else{
            for (int i = 0; i < 32; i++) {
                if(e.getSource().equals((play[i]))){
                    op = i;
                    break;
                }
            }
        }
        if(play[op].Dead()){
            if(ChessPlayJudge==0 && play[judge].getName().charAt(0)=='红'){
                ex=play[judge].getX();
                ey=play[judge].getY();
                if(judge>=0 && judge<4){
                    System.out.println("移动红车");
                    rules.carRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=4 && judge<8){
                    System.out.println("移动红马");
                    rules.horseRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=8 && judge<12){
                    System.out.println("移动红象");
                    rules.eleRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=12 && judge<16){
                    System.out.println("移动红士");
                    rules.chapRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=16 && judge<26){
                    System.out.println("移动红兵");
                    rules.soliderRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=26 && judge<30){
                    System.out.println("移动红炮");
                    rules.cannonRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=30 && judge<32){
                    System.out.println("移动红帅");
                    rules.bossRule(play[judge],play,e,regretList,judge);
                }
                if(ex==play[judge].getX() && ey==play[judge].getY()){
                    text.setText("无效点击，红棋走棋");
                    ChessPlayJudge=0;
                }
                else{
                    text.setText("黑棋走棋");
                    ChessPlayJudge=1;
                    CheckMouse=false;
                }
            }
            if(ChessPlayJudge==1 && play[judge].getName().charAt(0)=='黑'){
                ex=play[judge].getX();
                ey=play[judge].getY();
                if(judge>=0 && judge<4){
                    System.out.println("移动黑车");
                    rules.carRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=4 && judge<8){
                    System.out.println("移动黑马");
                    rules.horseRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=8 && judge<12){
                    System.out.println("移动黑象");
                    rules.eleRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=12 && judge<16){
                    System.out.println("移动黑士");
                    rules.chapRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=16 && judge<26){
                    System.out.println("移动黑兵");
                    rules.soliderRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=26 && judge<30){
                    System.out.println("移动黑炮");
                    rules.cannonRule(play[judge],play,e,regretList,judge);
                }
                else if(judge>=30 && judge<32){
                    System.out.println("移动黑帅");
                    rules.bossRule(play[judge],play,e,regretList,judge);
                }
                if(play[op].Dead()){
                    text.setText("无效点击，黑棋走棋");
                    ChessPlayJudge=1;
                }
                else{
                    text.setText("红棋走棋");
                    ChessPlayJudge=0;
                    CheckMouse=false;
                }
            }
        }
        if(ChessPlayJudge == 0){
            if(play[op].getName().charAt(0) == '红'){
                judge = op;
                CheckMouse = true;
                return ;
            }
            if(play[op].getName().charAt(0) == '黑' && play[judge].getName().charAt(0) == '红'){
                ex=play[judge].getX();
                ey=play[judge].getY();
                if(judge>=0 && judge<4){
                    System.out.println("红车吃子");
                    rules.carEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=4 && judge<8){
                    System.out.println("红马吃子");
                    rules.horseEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=8 && judge<12){
                    System.out.println("红象吃子");
                    rules.eleEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=12 && judge<16){
                    System.out.println("红士吃子");
                    rules.chapEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=16 && judge<26){
                    System.out.println("红兵吃子");
                    rules.soliderEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=26 && judge<30){
                    System.out.println("红炮吃子");
                    rules.cannonEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=30 && judge<32){
                    System.out.println("红帅吃子");
                    rules.bossEat(play[judge],play,e,regretList,judge,play[op],op);
                    rules.faceEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                if(!play[op].Dead()){
                    text.setText("无效点击，红棋走棋");
                    ChessPlayJudge=0;
                }
                else{
                    if(play[30].death){
                        JOptionPane.showMessageDialog(this,"红方获胜");
                        try{
                            Clip clip = AudioSystem.getClip();
                            File file = new File("sounds/吃.wav");
                            AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                            clip.open(audioInput);
                            clip.start();
                        }
                        catch (Exception ex1){
                            ex1.printStackTrace();
                        }
                        gameOver=true;
                        CheckMouse=false;
                        return;
                    }
                    for(int i=0;i<32;i++){
                        if(play[i].Dead()){
                            play[i].setVisible(false);
                            play[i].setBounds(0,0,1,1);
                        }
                    }
                    text.setText("黑棋走棋");
                    ChessPlayJudge=1;
                    CheckMouse=false;
                }
            }
        }
        else if(ChessPlayJudge == 1){
            if(play[op].getName().charAt(0) == '黑'){
                judge = op;
                CheckMouse = true;
                return ;
            }
            if(play[op].getName().charAt(0) == '红' && play[judge].getName().charAt(0) == '黑'){
                ex=play[judge].getX();
                ey=play[judge].getY();
                if(judge>=0 && judge<4){
                    System.out.println("黑车吃子");
                    rules.carEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=4 && judge<8){
                    System.out.println("黑马吃子");
                    rules.horseEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=8 && judge<12){
                    System.out.println("黑象吃子");
                    rules.eleEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=12 && judge<16){
                    System.out.println("黑士吃子");
                    rules.chapEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=16 && judge<26){
                    System.out.println("黑兵吃子");
                    rules.soliderEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=26 && judge<30){
                    System.out.println("黑炮吃子");
                    rules.cannonEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                else if(judge>=30 && judge<32){
                    System.out.println("黑帅吃子");
                    rules.bossEat(play[judge],play,e,regretList,judge,play[op],op);
                    rules.faceEat(play[judge],play,e,regretList,judge,play[op],op);
                }
                if(!play[op].Dead()){
                    text.setText("无效点击，黑棋走棋");
                    ChessPlayJudge=1;
                }
                else{
                    if(play[31].death){
                        JOptionPane.showMessageDialog(this,"黑方获胜");
                        try{
                            Clip clip = AudioSystem.getClip();
                            File file = new File("sounds/吃.wav");
                            AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                            clip.open(audioInput);
                            clip.start();
                        }
                        catch (Exception ex2){
                            ex2.printStackTrace();
                        }
                        gameOver=true;
                        CheckMouse=false;
                        return;
                    }
                    for(int i=0;i<32;i++) {
                        if (play[i].Dead()) {
                            play[i].setVisible(false);
                            play[i].setBounds(0, 0, 1, 1);
                        }
                    }
                    text.setText("红棋走棋");
                    ChessPlayJudge=0;
                    CheckMouse=false;
                }
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public synchronized void run() {
        while(true){
            if(CheckMouse){
                play[judge].setVisible(false);
                try{
                    tmain.sleep(200);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                play[judge].setVisible(true);
                try{
                    tmain.sleep(200);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                for(int i=0;i<32;i++){
                    if(i!=judge && !play[judge].Dead()){
                        play[i].setVisible(true);
                    }
                }
            }
            else{
                text.setVisible(false);
                try{
                    tmain.sleep(200);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                text.setVisible(true);
                try{
                    tmain.sleep(200);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}
