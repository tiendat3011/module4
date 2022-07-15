package diction.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepositoryImpl implements DictionaryRepository {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "chao`");
        dictionary.put("dog", "chó");
        dictionary.put("duck", "vịt");
        dictionary.put("fish", "cá");
        dictionary.put("bird", "chim");
    }

    @Override
    public Map<String, String> getDictionary() {
        return dictionary;
    }
}
