package web.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import web.demo.model.admin;
import web.demo.service.adminService;
import web.demo.repo.adminRepository;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;


@SpringBootTest
public class adminTest {




    @Autowired
    private adminService admService;

    @MockBean
    private adminRepository admRepo;

    @Test
    public void getAdminsTest() {
        when(admRepo.findAll()).thenReturn(Stream
                .of(new admin("aaa", "aaa", "aaa", 1), new admin("bbb", "bbb", "ccc", 2)).collect(Collectors.toList()));
        Assertions.assertEquals(2, admService.getAdmins().size());
    }

    @Test
    public void getAdminByMailTest() {
        String mail = "bbb";
        when(admRepo.findByMail(mail)).thenReturn(Stream.of(new admin("ccc", "ccc", "ccc", 33)).collect(Collectors.toList()));
        Assertions.assertEquals(1, admRepo.findByMail(mail).size());
    }

    @Test
    public void saveAdminTest() {
        admin adm = new admin("ddd", "ddd", "ddd", 44);
        when(admRepo.save(adm)).thenReturn(adm);
        Assertions.assertEquals(adm, admService.createAdmin(adm));
    }

    @Test
    public void deleteAdminTest() {
        admin adm = new admin("eee", "eee", "eee", 55);
        admService.deleteAdmin(55);
        verify(admRepo, times(1)).deleteById(55);
    }

}