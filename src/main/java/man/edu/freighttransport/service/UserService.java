package man.edu.freighttransport.service;

import man.edu.freighttransport.domain.User;
import man.edu.freighttransport.domain.security.PasswordResetToken;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);
}
