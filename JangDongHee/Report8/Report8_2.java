package JangDongHee.Report8;

class SutdaDeck1 {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck1() {
        for (int i = 0; i < cards.length; i++) {
            int num = i + 1;
            boolean isKwang = (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                j = (int)(Math.random()*cards.length);
                SutdaCard tmp;
                tmp = cards[j];
                cards[j] = cards[i];
                cards[i] = tmp;
            }
        }
    }

    SutdaCard pick(int index) {
        if (index < 0 || index > 20){
            return null;
        }return cards[index];
        // (구현)
    }

    SutdaCard pick() {
        // (구현)
        int random = (int)(Math.random()*cards.length);
        return cards[random];
    }
    // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
}

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1() {
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck1 deck1 = new SutdaDeck1();

        System.out.println(deck1.pick(0));
        System.out.println(deck1.pick());
        deck1.shuffle();

        for(int i=0; i < deck1.cards.length;i++)
            System.out.print(deck1.cards[i]+",");

        System.out.println();
        System.out.println(deck1.pick(0));
    }
}