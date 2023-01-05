package Model.service;

import Model.repository.CongNhanRepository;
import Model.repository.ICongNhanRepository;

public class CongNhanService implements ICongNhanService{
    ICongNhanRepository iCongNhanRepository = new CongNhanRepository();

    @Override
    public void display() {
        iCongNhanRepository.display();
    }

    @Override
    public void add() {
        iCongNhanRepository.add();
    }

    @Override
    public void search() {
        iCongNhanRepository.search();
    }
}
