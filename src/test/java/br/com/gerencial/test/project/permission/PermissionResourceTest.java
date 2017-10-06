package br.com.gerencial.test.project.permission;

import br.com.gerencial.project.utils.ResourcePaths;
import br.com.gerencial.test.project.utils.BaseEntityResourceTest;
import org.junit.Test;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.payload.PayloadDocumentation;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class PermissionResourceTest extends BaseEntityResourceTest {

    private static final String PERMISSION_ID = "Identificador único da Permissão.";

    private static final String ROLE = "Nome da Permissão";


    @Test
    public void findAll_succes() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get(ResourcePaths.PERMISSION_PATH))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(
                        MockMvcRestDocumentation.document("{method-name}",
                                PayloadDocumentation.responseFields(
                                        PayloadDocumentation.fieldWithPath("[].id").description(PERMISSION_ID),
                                        PayloadDocumentation.fieldWithPath("[].role").description(ROLE)
                                )
                        )
                )
                .andDo(MockMvcResultHandlers.print());

    }

}
