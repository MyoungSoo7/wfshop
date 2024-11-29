package org.welfare.wfshop.common;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum Errors {
    USER_NOT_FOUND("USER_NOT_FOUND");

    String errorMessage;

}
