package diction.service;

import diction.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public String getDictionary(String word) {
        Map<String, String> dictionary = dictionaryRepository.getDictionary();
        if (dictionary.get(word) != null) {
            return dictionary.get(word);
        } else {
            return "not found";
        }
    }
}