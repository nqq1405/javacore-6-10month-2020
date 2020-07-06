package lession5.Activity53;

public class Dictionary {
    private Word[] words;

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Dictionary() {
    }

    public Word timkiem_theo_word(Word tu){
        Word tutimdc = null;
        for (Word a: words) {
            if(a.getKey().equals(tu.getKey()) && a.getType().equals(tu.getType())){
                tutimdc = a;
            }
        }
        return tutimdc;
    }

    public Word timkiem_theo_key_type(String key, String type){
        Word tutimdc = null;
        for (Word a: words) {
            if(a.getKey().equals(key) && a.getType().equals(type)){
                tutimdc = a;
            }
        }
        return tutimdc;
    }

    public int numberVA(){
        int dem = 0;
        for (Word a : words) {
            if (a.getType().equals("VA")) {
                dem++;
            }
        }
        return dem;
    }

    public int numberAV(){
        int dem = 0;
        for (Word a : words) {
            if (a.getType().equals("AV")) {
                dem++;
            }
        }
        return dem;
    }
}
