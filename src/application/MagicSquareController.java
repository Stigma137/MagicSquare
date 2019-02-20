package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.MagicSquare;	

public class MagicSquareController implements Initializable{
	//Atributes									
    @FXML
    private Tab tabB;
    @FXML
    private ComboBox<Integer> comboBox1;
    @FXML
    private ComboBox<String> comboBox2;
    @FXML
    private ComboBox<String> comboBox3;
    @FXML
    private GridPane gridPane;
    @FXML    
    private TextField text1;
    @FXML
    private Label l3;
    private MagicSquare mg;
  	
	ObservableList<String> list = FXCollections.observableArrayList("NO","NE","SO","SE");
	ObservableList<String> list2 = FXCollections.observableArrayList("Row-1","Column-1","Row-2","Column-2");
	ObservableList<Integer> list1 = FXCollections.observableArrayList(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29);
	@Override
	//Initialize method

	public void initialize(URL location, ResourceBundle resources) {
		comboBox1.setItems(list1);
		comboBox2.setItems(list);
		comboBox3.setItems(list2);
		comboBox2.setValue("NO");
		comboBox3.setValue("Row-1");
		mg = new MagicSquare();
		gridPane = new GridPane();
		tabB.setContent(gridPane);
		gridPane.setAlignment(Pos.CENTER);
	}
	/* Method that reacts to a event of Action Event type in order to select the magic square order from a list of values.
	 * 
	 */
	public void selectOrder(ActionEvent event) { 
		if(gridPane.getChildren().size()>0){ 
		    gridPane.getChildren().clear();  
		}
		mg.setOrder((comboBox1.getValue()));
		text1.setText(Integer.toString(mg.getMagicConstant()));
		showSquare(comboBox1.getValue());	        
	}
	/* Method that reacts to a event of Action Event type in order to select the direction of the diagonal from a list of directions.
	 * 
	 */
	public void selectDirection(ActionEvent event) {
		
	}
	/* Method that reacts to a event of Action Event type in order to select the initial perimeter row or column from a list of directions.
	 * 
	 */
	public void selectInitial(ActionEvent event) {
		
	}
	/* Method that allows to build and show the magic square through a n that indicates its order.
	 * @param A number that indicates the magic constant.
	 * @return A GridPane with its correspondent magic square as labels inside itself.
	*/
	public GridPane showSquare(int n) {
		int[][] magicSquare = new int[n][n]; 
		int i = n/2; 
		int j = n-1;	
		for (int num=1; num <= n*n;) 
		{ 
			if (i==-1 && j==n) { 
				j = n-2; 
				i = 0; 
			} 
			else { 
				if (j == n) 
					j = 0; 
				if (i < 0) 
					i=n-1; 
			} 
			if (magicSquare[i][j] != 0) { 
				j -= 2; 
				i++; 
				continue; 
			} 
			else
				magicSquare[i][j] = num++; 
			j++; i--; 
		}  
		for(i=0; i<n; i++) 
		{ 
			for(j=0; j<n; j++) 
				 gridPane.add(new Label(magicSquare[i][j]+""), i, j);
				 gridPane.setHgap(10);
				 gridPane.setGridLinesVisible(true);
		} 
		return gridPane;
	}
}


