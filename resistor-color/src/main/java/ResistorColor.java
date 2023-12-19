class ResistorColor {

    String[] colorList = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
       for (int i=0;i<colorList.length;i++)
           if (colorList[i].equals(color)) return i;
       return -1;
    }

    String[] colors() {
       return colorList;
    }
}
