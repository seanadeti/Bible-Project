import java.util.HashMap;
import java.util.Scanner;

public class bibleProject {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> creationDays;
        creationDays = new HashMap<>();


        // Used NIV Bible
        creationDays.put("Day1", "And God said, “Let there be light,” and there was light. " +
                "God saw that the light was good, and he separated the light " +
                "from the darkness. God called the light “day,” and the darkness " +
                "he called “night.” And there was evening, and there was morning—the first day.");

        creationDays.put("Day2","And God said, “Let there be a vault between the waters to separate water " +
                "from water.” So God made the vault and separated the water under the vault from" +
                " the water above it. And it was so. God called the vault “sky.” And there was " +
                "evening, and there was morning—the second day.");

        creationDays.put("Day3","And God said, “Let the water under the sky be gathered to one place, " +
                "and let dry ground appear.” And it was so. God called the dry ground “land,”" +
                " and the gathered waters he called “seas.” And God saw that it was good. " +
                "Then God said, “Let the land produce vegetation: seed-bearing plants and " +
                "trees on the land that bear fruit with seed in it, according to their various " +
                "kinds.” And it was so. The land produced vegetation: plants bearing seed " +
                "according to their kinds and trees bearing fruit with seed in it according to their kinds. " +
                "And God saw that it was good. And there was evening, and there was morning—the third day.");

        creationDays.put("Day4", "And God said, “Let there be lights in the vault of the sky to separate the " +
                "day from the night, and let them serve as signs to mark sacred times, and " +
                "days and years, and let them be lights in the vault of the sky to give " +
                "light on the earth.” And it was so. God made two great lights—the greater " +
                "light to govern the day and the lesser light to govern the night. " +
                "He also made the stars. God set them in the vault of the sky to give " +
                "light on the earth, to govern the day and the night, and to separate " +
                "light from darkness. And God saw that it was good. And there was evening, and " +
                "there was morning—the fourth day.");

        creationDays.put("Day5", "And God said, “Let the water teem with living creatures, and let birds fly " +
                "above the earth across the vault of the sky.” So God created the great creatures of the " +
                "sea and every living thing with which the water teems and that moves about in it, " +
                "according to their kinds, and every winged bird according to its kind. " +
                "And God saw that it was good. God blessed them and said, “Be fruitful and increase in " +
                "number and fill the water in the seas, and let the birds increase on the earth.” " +
                "And there was evening, and there was morning—the fifth day.");

        creationDays.put("Day6", "And God said, “Let the land produce living creatures according to their kinds: " +
                "the livestock, the creatures that move along the ground, and the wild animals," +
                " each according to its kind.” And it was so. God made the wild animals " +
                "according to their kinds, the livestock according to their kinds, " +
                "and all the creatures that move along the ground according to their kinds." +
                " And God saw that it was good. Then God said, “Let us make mankind in our image," +
                " in our likeness, so that they may rule over the fish in the sea and the birds " +
                "in the sky, over the livestock and all the wild animals, and over all " +
                "the creatures that move along the ground.” So God created mankind in his own " +
                "image, in the image of God he created them; male and female he created them. " +
                "God blessed them and said to them, “Be fruitful and increase in number; " +
                "fill the earth and subdue it. Rule over the fish in the sea and the birds " +
                "in the sky and over every living creature that moves on the ground.” " +
                "Then God said, “I give you every seed-bearing plant on the face of the " +
                "whole earth and every tree that has fruit with seed in it. " +
                "They will be yours for food. And to all the beasts of the earth and all the " +
                "birds in the sky and all the creatures that move along the ground—everything " +
                "that has the breath of life in it—I give every green plant for food.” " +
                "And it was so. God saw all that he had made, and it was very good. " +
                "And there was evening, and there was morning—the sixth day.");

        creationDays.put("Day7", "Thus the heavens and the earth were completed in all their vast array. " +
                "By the seventh day God had finished the work he had been doing; so on the " +
                "seventh day he rested from all his work. Then God blessed the seventh " +
                "day and made it holy, because on it he rested from all the work of creating that" +
                " he had done.");

        creationDays.put("Day1_Verse", "Genesis 1:3-5");
        creationDays.put("Day2_Verse","Genesis 1:6-8");
        creationDays.put("Day3_Verse", "Genesis 1:9-13");
        creationDays.put("Day4_Verse", "Genesis 1:14-19");
        creationDays.put("Day5_Verse", "Genesis 1:20-23");
        creationDays.put("Day6_Verse", "Genesis 1:24-31");
        creationDays.put("Day7_Verse", "Genesis 2:1-3");

        while (true) {

            System.out.println("Enter a day of the creation week (e.g., Day1, Day2, etc.). Type 'Exit' to exit." +
                    " Type 'Exit' to exit ");
            System.out.println("To know the verse from which an event was recorded, enter 'DayNumber_Verse'. " +
                    "Ex: Day1_Verse ");
            String day = scanner.nextLine();


            if (creationDays.containsKey(day)) {
                System.out.println(creationDays.get(day));
            } else if (day.equals("Exit")) {
                break;
            } else {
                System.out.println("Error occurred, please follow the instructions given.");
            }
        }
    }
}