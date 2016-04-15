//U10416019鄭文琪

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import java.util.*;



public class ActionCalculatorFX extends Application{

	//data field
	//create variable str to print the numbers ane symbles
	String str = "";
	//create variable strfirst let the textfield print 0
	String strfirst = "0";
	String strnum = "";
	int symbol = 0;
	String number = "";
	double total = 0;
	char pattern = '+';

	@Override
	public void start(Stage primaryStage){
		
		//create a variable pane to input all panes
		GridPane pane = new GridPane();
		
		//create a variable paneTitle to input menu
		GridPane paneTitle = new GridPane();
		
		
		//create a menu bar
		MenuBar mainMenu = new MenuBar();
		//create a variable view to input all the lists in view 
		Menu view = new Menu("檢視(V)");
		MenuItem type = new MenuItem("標準型(T)\tAlt+1");
		MenuItem engineer = new MenuItem("工程型(S)\tAlt+2");
		MenuItem programmer = new MenuItem("程式設計師(P)\tAlt+3");
		MenuItem statistic = new MenuItem("統計資料(A)\tAlt+4");
		MenuItem historyView = new MenuItem("歷程紀錄(Y)\tCtrl+H");
		MenuItem digit = new MenuItem("數字分位(I)");
		MenuItem basic = new MenuItem("基本(B)\tCtrl+F4");
		MenuItem unitConversion = new MenuItem("單位轉換(U)\tCtrl+U");
		MenuItem date = new MenuItem("日期計算(D)\tCtrl+E");
		MenuItem work = new MenuItem("工作表(W)");
		view.getItems().addAll(type, engineer, programmer, statistic, historyView, digit, basic, unitConversion, date, work);
		
		//create a variable edit to input all the lists in edit
		Menu edit = new Menu("編輯(E)");
		MenuItem copy = new MenuItem("複製(C)\tCtrl+C");
		MenuItem paste = new MenuItem("貼上(P)\tCtrl+V");
		MenuItem historyEdit = new MenuItem("歷程紀錄(H)");
		edit.getItems().addAll(copy, paste, historyEdit);
		
		//create a variable help to input all the lists in help
		Menu help = new Menu("說明(H)");
		MenuItem viewHelp = new MenuItem("檢視說明(V)\tF1");
		MenuItem aboutCalculator = new MenuItem("關於小算盤(A)");
		help.getItems().addAll(viewHelp, aboutCalculator);
 
 		//add all menu lists in menu bar
		mainMenu.getMenus().addAll(view, edit, help);
		//add menu bar in the paneTitle
		paneTitle.add(mainMenu, 0, 0);

		
		//create a pane paneText to input text field
		StackPane paneText = new StackPane();
		//create a variable text
		TextField text = new TextField("0");
		//create a label
		Label label = new Label("  ");
		VBox labelAndText = new VBox(0);
		labelAndText.getChildren().addAll(label, text);
		//let the cursor from left to right
		text.setAlignment(Pos.CENTER_RIGHT);
		text.setEditable(false);
		//add the text in the paneText pane
		paneText.getChildren().addAll(labelAndText);
	
		
		//create a pane paneBody to input all buttons
		Pane paneBody = new Pane();
		VBox vBox1 = new VBox(5);
		VBox vBox2 = new VBox(5);
		HBox hBox1 = new HBox(5);
		VBox vBox3 = new VBox(5);
		VBox vBox4 = new VBox(5);
		VBox vBox5 = new VBox(5);
		VBox vBox6 = new VBox(5);
		VBox vBox7 = new VBox(5);
		HBox hBox2 = new HBox(5);
		HBox hBox3 = new HBox(5);
		VBox vBox8 = new VBox(5);
		HBox hBox4 = new HBox(5);
		VBox vBox9 = new VBox(5);
		HBox hBox5 = new HBox(5);

		Button one = new Button("  1  ");
		Button two = new Button(" 2  ");
		Button three = new Button(" 3  ");
		Button four = new Button(" 4  ");
		Button five = new Button(" 5  ");
		Button six = new Button(" 6  ");
		Button seven = new Button(" 7  ");
		Button eight = new Button(" 8  ");
		Button nine = new Button(" 9  ");
		Button zero = new Button("        0       ");
		Button plus = new Button(" +  ");
		Button minus = new Button(" -  ");
		Button multiply = new Button(" x  ");
		Button divide = new Button("  /  ");
		Button persent = new Button(" % ");
		Button fraction = new Button("1/x");
		Button dot = new Button("  .  ");
		Button equal = new Button("\n = \n   ");
		Button MC = new Button("MC");
		Button MR = new Button("MR");
		Button MS = new Button("MS");
		Button Mplus = new Button("M+");
		Button Mminus = new Button("M-");
		Button delete = new Button("<--");
		Button CE = new Button("CE ");
		Button C = new Button(" C  ");
		Button plusAndMinus = new Button("+- ");
		Button root = new Button("v--");

		//add all buttons in the paneBody pane
		vBox1.getChildren().addAll(MC, delete, seven, four, one);
		vBox2.getChildren().addAll(MR, CE, eight, five, two);
		hBox1.getChildren().addAll(vBox1, vBox2);
		vBox9.getChildren().addAll(hBox1, zero);
		vBox3.getChildren().addAll(MS, C, nine, six);
		vBox4.getChildren().addAll(Mplus, plusAndMinus, divide, multiply);
		vBox5.getChildren().addAll(Mminus, root, persent, fraction);
		vBox6.getChildren().addAll(three, dot);
		vBox7.getChildren().addAll(minus, plus);
		hBox5.getChildren().addAll(equal);
		hBox2.getChildren().addAll(vBox6, vBox7, hBox5);
		hBox3.getChildren().addAll(vBox3, vBox4, vBox5);
		vBox8.getChildren().addAll(hBox3, hBox2);
		hBox4.getChildren().addAll(vBox9, vBox8);
		
		paneBody.getChildren().add(hBox4);
		
	
		//add all panes in the pane
		pane.add(paneTitle, 0, 0);
		pane.add(paneText, 0, 1);
		pane.add(paneBody, 0, 2);
		
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 215, 265);
		primaryStage.setTitle("U10416019 鄭文琪");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		//add action event of all button
		one.setOnAction((ActionEvent e) -> {
			//let the text display the number
			strnum = strnum + "1";
			str = str + "1";
			text.setText(str);
		});
		
		two.setOnAction((ActionEvent e) -> {
			strnum = strnum + "2";
			str = str + "2";
			text.setText(str);
		});
		
		three.setOnAction((ActionEvent e) -> {
			strnum = strnum + "3";
			str = str + "3";
			text.setText(str);
		});
		
		four.setOnAction((ActionEvent e) -> {
			strnum = strnum + "4";
			str = str + "4";
			text.setText(str);
		});
		
		five.setOnAction((ActionEvent e) -> {
			strnum = strnum + "5";
			str = str + "5";
			text.setText(str);
		});
		
		six.setOnAction((ActionEvent e) -> {
			strnum = strnum + "6";
			str = str + "6";
			text.setText(str);
		});
		
		seven.setOnAction((ActionEvent e) -> {
			strnum = strnum + "7";
			str = str + "7";
			text.setText(str);
		});
		
		eight.setOnAction((ActionEvent e) -> {
			strnum = strnum + "8";
			str = str + "8";
			text.setText(str);
		});
		
		nine.setOnAction((ActionEvent e) -> {
			strnum = strnum + "9";
			str = str + "9";
			text.setText(str);
		});
		
		zero.setOnAction((ActionEvent e) -> {
			strnum = strnum + "0";
			str = str + "0";
			text.setText(str);
		});
		
		dot.setOnAction((ActionEvent e) -> {
			strnum = strnum + ".";
			str = str + ".";
			text.setText(str);
		});
		
		plus.setOnAction((ActionEvent e) -> {
			//determine whether the number hasn't been calculate
			if(symbol == 0){
				total = Double.valueOf(strnum);
				symbol = 1;
			}
			else if(symbol == 1){
				number = strnum;
				calculate();
			}
			//let the string become empty
			strnum = "";
			pattern = '+';
			str = str + "+";
			//print the string on the text
			text.setText(str);
		});
		
		minus.setOnAction((ActionEvent e) -> {
			if(symbol == 0){
				total = Double.valueOf(strnum);
				symbol = 1;
			}
			else if(symbol == 1){
				number = strnum;
				calculate();
			}
			strnum = "";
			pattern = '-';
			str = str + "-";
			text.setText(str);
		});
		
		multiply.setOnAction((ActionEvent e) -> {
			if(symbol == 0){
				total = Double.valueOf(strnum);
				symbol = 1;
			}
			else if(symbol == 1){
				number = strnum;
				calculate();
			}
			strnum = "";
			pattern = 'x';
			str = str + "x";
			text.setText(str);
		});
		
		divide.setOnAction((ActionEvent e) -> {
			if(symbol == 0){
				total = Double.valueOf(strnum);
				symbol = 1;
			}
			else if(symbol == 1){
				number = strnum;
				calculate();
			}
			strnum = "";
			pattern = '/';
			str = str + "/";
			text.setText(str);
		});
		
		persent.setOnAction((ActionEvent e) -> {
			if(symbol == 0){
				total = Double.valueOf(strnum);
				symbol = 1;
			}
			else if(symbol == 1){
				number = strnum;
				calculate();
			}
			strnum = "";
			pattern = '%';
			str = str + "%";
			text.setText(str);
		});
		
		fraction.setOnAction((ActionEvent e) -> {
			if(symbol == 0){
				total = Double.valueOf(strnum);
				symbol = 1;
			}
			else if(symbol == 1){
				number = strnum;
				calculate();
			}
			strnum = "";
			pattern = 'f';
			str = "1/" + str;
			text.setText(str);
		});

	//create a method to calculate the number
	//when press plus button, minus button, etc
	public void calculate(){
		switch(pattern){
			case '+':
				total = total + Double.valueOf(strnum);
				break;
				
			case '-':
				total = total - Double.valueOf(strnum);
				break;
					
			case 'x':
				total = total * Double.valueOf(strnum);
				break;
					
			case '/':
				total = total / Double.valueOf(strnum);
				break;
					
			case '%':
				total = total / 100;
				break;
					
			case 'f':
				total = 1 / total;
				break;
			
		}
	}
	
}