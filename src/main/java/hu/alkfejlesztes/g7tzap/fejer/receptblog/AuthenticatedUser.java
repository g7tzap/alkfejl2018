package hu.alkfejlesztes.g7tzap.fejer.receptblog;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import hu.alkfejlesztes.g7tzap.fejer.receptblog.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RequestScope
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticatedUser {
    private User user;
}
