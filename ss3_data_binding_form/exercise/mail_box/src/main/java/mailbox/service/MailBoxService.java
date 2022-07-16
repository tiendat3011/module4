package mailbox.service;

import java.util.List;

public interface MailBoxService {
    List<String> languages();

    List<Integer> size();
}