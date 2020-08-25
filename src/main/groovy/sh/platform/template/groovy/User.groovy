package sh.platform.template.groovy

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import javax.validation.constraints.NotBlank

@Document
class User {

    @Id
    String id;

    @NotBlank(message = "Name is mandatory")
    String name;

    @NotBlank(message = "Language is mandatory")
    String language;

}