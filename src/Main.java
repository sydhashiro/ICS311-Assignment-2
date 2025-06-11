public class Main {
    public static void main(String[] args) {
        BalancedTreeDictionary dictionary = new BalancedTreeDictionary();

        // Add sample sayings
        dictionary.insert(new Saying(
            "Ua ola loko i ke aloha",
            "Love gives life within.",
            "Hoʻōla ke aloha i ke kino a me ka ʻuhane.",
            "Love heals both body and spirit."
        ));

        dictionary.insert(new Saying(
            "I ola no ke kino i ka māʻona o ka ʻōpū",
            "The body enjoys health when the stomach is well filled.",
            "He ola ke ʻai ʻana i ka maikaʻi.",
            "Eating well brings life."
        ));

        dictionary.insert(new Saying(
            "Pūʻali kalo i ka we ʻole",
            "Taro, for lack of water, grows misshapen.",
            "ʻAʻohe wai, pālahalaha ke kalo.",
            "Without resources, potential is stunted."
        ));

        // Test member
        System.out.println("Member check: " + dictionary.member("Ua ola loko i ke aloha"));

        // Test first and last
        System.out.println("First: " + dictionary.first());
        System.out.println("Last: " + dictionary.last());

        // Test predecessor and successor
        System.out.println("Predecessor of 'Pūʻali kalo i ka we ʻole': " +
            dictionary.predecessor("Pūʻali kalo i ka we ʻole"));
        System.out.println("Successor of 'I ola no ke kino i ka māʻona o ka ʻōpū': " +
            dictionary.successor("I ola no ke kino i ka māʻona o ka ʻōpū"));

        // Test meHua
        System.out.println("Sayings with Hawaiian word 'ke':");
        for (Saying s : dictionary.meHua("ke")) {
            System.out.println(s);
        }

        // Test withWord
        System.out.println("Sayings with English word 'life':");
        for (Saying s : dictionary.withWord("life")) {
            System.out.println(s);
        }
    }
}