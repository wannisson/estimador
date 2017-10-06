package br.com.gerencial.test.project.domain.user;

import br.com.gerencial.project.permission.Permission;
import br.com.gerencial.project.utils.ResourcePaths;
import br.com.gerencial.test.project.utils.BaseEntityResourceTest;
import org.junit.Test;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.payload.PayloadDocumentation;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class UserResourceTest extends BaseEntityResourceTest {

    private static final String USER_ID = "Identificador único do usuário.";

    private static final String USER_NAME = "Nome do usuário.";

    private static final String EMAIL = "Email do usuário";

    private static final String PASSWORD = "Senha do usuário";

    private static final String PHONE = "34991393623";

    private static final Permission PERMISSION_ENTITY = new Permission();



    @Test
    public void findAll_success() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get(ResourcePaths.USER_PATH))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(
                        MockMvcRestDocumentation.document("{method-name}",
                                PayloadDocumentation.responseFields(
                                        PayloadDocumentation.fieldWithPath("[].id").description(USER_ID),
                                        PayloadDocumentation.fieldWithPath("[].name").description(USER_NAME),
                                        PayloadDocumentation.fieldWithPath("[].email").description(EMAIL),
                                        PayloadDocumentation.fieldWithPath("[].password").description(PASSWORD),
                                        PayloadDocumentation.fieldWithPath("[].phone").description(PHONE),
                                        PayloadDocumentation.fieldWithPath("[].permissions").description(PERMISSION_ENTITY)
                                )
                        )
                )
                .andDo(MockMvcResultHandlers.print());

    }

}
