package FutureCraft.tikitaka.back_end.entity;

import FutureCraft.tikitaka.back_end.dto.request.sign.SignUpRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String password;
    private String profileImage;

    public User(SignUpRequestDto dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.password = dto.getPassword();
        this.profileImage = null;
    }
    
    public void updateName(String name) {
        this.name = name;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public void updateProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
