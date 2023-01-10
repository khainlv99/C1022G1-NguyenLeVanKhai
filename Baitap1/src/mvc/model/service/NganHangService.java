package mvc.model.service;

import mvc.model.repository.INganHangRepository;
import mvc.model.repository.NganHangRepository;

public class NganHangService implements INganHangService {
    INganHangRepository repository = new NganHangRepository();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void dangky() {
        repository.dangky();
    }
}
