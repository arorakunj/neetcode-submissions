class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] arrayOne = sentence1.split(" ");
        String[] arrayTwo = sentence2.split(" ");

        if (arrayOne.length > arrayTwo.length) {
            String[] temp = arrayOne;
            arrayOne = arrayTwo;
            arrayTwo = temp;
        }

        int indexShort = 0;
        int indexLong = 0;

        while (indexShort < arrayOne.length &&
                arrayOne[indexShort].equals(arrayTwo[indexLong])) {
            indexShort++;
            indexLong++;
        }

        int endShort = arrayOne.length - 1;
        int endLong = arrayTwo.length - 1;

        while (endShort >= indexShort &&
                arrayOne[endShort].equals(arrayTwo[endLong])) {
            endShort--;
            endLong--;
        }

        if (endShort < indexShort) {
            return true;
        }

        return false;
    }
}
