// Sydney Haahiro - Saying class
public class Saying implements Comparable<Saying> {
    private final String hawaiian;
    private final String english;
    private final String explanationHawaiian;
    private final String explanationEnglish;

    public Saying (String hawaiian, String english, String explanationHawaiian, String explanationEnglish) {
        this.hawaiian = hawaiian;
        this.english = english;
        this.explanationHawaiian = explanationHawaiian;
        this.explanationEnglish = explanationEnglish;
    }

    public String getHawaiian() {
        return hawaiian;
    }

    public String getEnglish() {
        return english;
    }

    public String getExplanationHawaiian() {
        return explanationHawaiian;
    }

    public String getExplanationEnglish() {
        return explanationEnglish;
    }

    @Override
    public int compareTo(Saying other) {
        return this.hawaiian.compareTo(other.hawaiian);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Saying other) {
            return this.hawaiian.equals(other.hawaiian);
            }
            return false;
    }

    @Override
    public int hashCode() {
        return hawaiian.hashCode();
    }

    @Override
    public String toString() {
        return hawaiian + " = " + english;
    }
}