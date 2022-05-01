package app.Controller;

import app.DTO.Square;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import app.TYPES.Castle;
import app.TYPES.Empty;
import app.TYPES.Type;
import app.TYPES.Wall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class Controls {

    int numSquares = 260;

    ArrayList<Square> squares = new ArrayList<>();
    String [] types = new String[numSquares];

    public void begin(){
        Random r = new Random();
        int home = r.nextInt(260);
        int enemy = r.nextInt(260);
        for(int i =0; i < numSquares; i++){
            Type e;

            if (i == home ){e = new Castle();}
            else{e = new Empty();}

            Square s = new Square(e, i);
            squares.add(s);
            types[i] = e.getName();

        }
    }

    @RequestMapping("/")
    public String startUp(Model model){
        begin();

        model.addAttribute("numGrids",260);

        model.addAttribute("getTypes",types);

        return "Game.html";
    }

    @PostMapping("update")

    public String update(Model model, String type, String num){

        System.out.println("THis is working  " + type + num);

        int idNum = getSquareNumber(num);

        types[idNum] = type;

        model.addAttribute("numGrids",260);

        model.addAttribute("getTypes",types);

        return "Game.html";

    }

    public int getSquareNumber(String s){

        String arr [] = s.split("");

        String num ="";


        for (int i = 0; i < arr.length; i ++){
            if (i != 0){
                num += arr[i];
            }
        }


        return Integer.parseInt(num);

    }





    public static void main(String args[]){

}
}
