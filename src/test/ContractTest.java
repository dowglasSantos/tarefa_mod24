package test;

import services.ContractService;
import dao.ContractServiceDao;
import dao.mock.ContractServiceMock;
import org.junit.Assert;
import org.junit.Test;
import services.Contract;

public class ContractTest {
    @Test
    public void saveTest() {
        ContractService service = new ContractService(new ContractServiceMock());
        String result = service.save();

        Assert.assertEquals("sucesso", result);
    }

    @Test(expected =  UnsupportedOperationException.class)
    public void errorSaveTest() {
        ContractService service = new ContractService(new ContractServiceDao());
        String result = service.save();
        Assert.assertEquals("sucesso", result);
    }

    @Test
    public void deleteTest() {
        ContractService service = new ContractService(new ContractServiceMock());
        Boolean result = service.delete("1");

        Assert.assertEquals(true, result);
    }

    @Test(expected =  UnsupportedOperationException.class)
    public void errorDeleteTest() {
        ContractService service = new ContractService(new ContractServiceDao());
        Boolean result = service.delete("1");

        Assert.assertEquals(true, result);
    }

    @Test
    public void toUpdateTest() {
        ContractService service = new ContractService(new ContractServiceMock());
        Boolean result = service.toUpdate(new Contract());

        Assert.assertEquals(true, result);
    }

    @Test(expected =  UnsupportedOperationException.class)
    public void errorToUpdateTest() {
        ContractService service = new ContractService(new ContractServiceDao());
        Boolean result = service.toUpdate(new Contract());

        Assert.assertEquals(true, result);
    }

    @Test
    public void searchTest() {
        ContractService service = new ContractService(new ContractServiceMock());
        Boolean result = service.search("1");

        Assert.assertEquals(true, result);
    }

    @Test(expected =  UnsupportedOperationException.class)
    public void errorSearchTest() {
        ContractService service = new ContractService(new ContractServiceDao());
        Boolean result = service.search("1");

        Assert.assertEquals(true, result);
    }
}
