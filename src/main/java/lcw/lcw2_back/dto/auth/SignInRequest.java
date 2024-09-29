package lcw.lcw2_back.dto.auth;

import lcw.lcw2_back.domain.storage.Storage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class SignInRequest {
    private String userId;
    private String storageId;
    private String userPw;
    private String userName;
    private LocalDate userBirth;
    private String userEmail;
    private String userContact;
}
