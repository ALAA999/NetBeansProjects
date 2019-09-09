package secoundsemester;


import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class hussamCatarogiy {

    static int nom_of_categories = 6;
    static String[] names = {"Administrative Areas", "Terrain(nouns)", "Terrain(adjectives)", "Weather Conditions(nouns)", "Weather Conditions(adjectives)",
        "Climate"
    };
    static ArrayList<String>[] items = new ArrayList[nom_of_categories];
    static Category[] categories = new Category[nom_of_categories];

    public static void main(String[] args) {

        buildCategories(items);

        int flag = 0;
        while (flag != -1) {
            int random = (int) (Math.random() * (nom_of_categories));
            int random2 = (int) (Math.random() * (categories[random].items.size()));
            String word = categories[random].items.get(random2);
            String categoryNames = getCategoryNames();
            String input = JOptionPane.showInputDialog("The word '" + word + "' refers to \n\n" + categoryNames);
            flag = Integer.parseInt(input);
            if (flag != random && flag != -1) {
                JOptionPane.showMessageDialog(null, "The word '" + word + "' refers to " + categories[random].name, "Wrong !", 0);
            } else if (flag == random) {
                JOptionPane.showMessageDialog(null, "Congratulations !\nThe word '" + word + "' refers to " + categories[random].name, "Congratulations !", -1);
            }
        }

    }

    public static void buildCategories(ArrayList<String>[] items) {

        String[][] itemData = new String[nom_of_categories][];
        itemData[0] = new String[]{"regions", "states", "provinces", "territories", "prefectures", "boroughs", "districts", "zones", "counties"};
        itemData[1] = new String[]{"deserts", "plains", "jungles", "forests", "plateaux", "moorland", "hills", "valleys", "mountains", "grasslands"};
        itemData[2] = new String[]{"sandy", "rocky", "grassy", "wooded", "flat", "hilly", "mountainous", "dusty"};
        itemData[3] = new String[]{"mist/fog", "flood", "monsoon", "storm", "sleet", "rain", "sunshine", "ice", "snow", "drought", "ryphoon",
            "hurricane", "cyclone", "wind", "clouds"};
        itemData[4] = new String[]{"misty/foggy", "wet", "stromy", "rainy", "cold", "freezing", "snowy", "icy", "hot", "humid", "warm", "mild",
            "dry", "sunny", "windy", "cloudy"
        };
        itemData[5] = new String[]{"oceanic", "maritime", "continental", "tempereate", "Mediterranean", "arid", "desert", "tropical", "equatorial", "polar"};

        for (int i = 0; i < nom_of_categories; i++) {
            ArrayList<String> itemsData = new ArrayList(Arrays.asList(itemData[i]));// it will take the row number i and put it in the itemsDate (ArrayList)
            categories[i] = new Category(itemsData, names[i]);
        }

    }

    public static String getCategoryNames() {
        String str = "";
        for (int i = 0; i < nom_of_categories; i++) {
            str += i + " - " + categories[i].name + "\n";
        }
        str += "enter -1 to exit";
        return str;
    }

}

class Category {
// the Category takes group of nuons and thier answer 
    public String name;
    public ArrayList<String> items = new ArrayList<String>();

    public Category(ArrayList<String> items, String name) {
        this.name = name;
        this.items = items;
    }
}
