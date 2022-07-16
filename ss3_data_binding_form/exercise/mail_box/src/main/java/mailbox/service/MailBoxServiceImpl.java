package mailbox.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MailBoxServiceImpl implements MailBoxService {
    @Override
    public List<String> languages() {
        List<String>languages = new ArrayList<>();
        languages.add("English");
        languages.add("French");
        languages.add("Japanese");
        languages.add("Korean");
        return languages;
    }

    @Override
    public List<Integer> size() {
        List<Integer> size = new ArrayList<>();
        size.add(5);
        size.add(10);
        size.add(15);
        size.add(20);
        return size;
    }
}
