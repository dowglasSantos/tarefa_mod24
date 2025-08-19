package dao;

import services.Contract;

public interface IContractServiceDao {
    String save();
    Boolean delete(String id);
    Boolean toUpdate(Contract contract);
    Boolean search(String id);
}
