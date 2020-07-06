package lession5.Activity53;

public class Word {
    private String key; // từ trong từ điển
    private String value; // nghĩa của từ
    private String type; // loại từ điển (AV-Anh Việt || VA-Việt Anh)


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Word(String key, String value, String type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public Word() {
    }
}
