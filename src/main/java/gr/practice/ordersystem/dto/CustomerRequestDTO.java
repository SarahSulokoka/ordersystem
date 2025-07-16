package gr.practice.ordersystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CustomerRequestDTO {

    @NotNull(message = "Το όνομα δεν μπορεί να είναι null.")
    @Size(min = 2, message = "Το όνομα πρέπει να περιέχει τουλάχιστον δύο χαρακτήρες.")
    private String firstname;

    @NotNull(message = "Το επώνυμο δεν μπορεί να είναι null.")
    @Size(min = 2, message = "Το επώνυμο πρέπει να περιέχει τουλάχιστον δύο χαρακτήρες.")
    private String lastname;

    @NotBlank(message = "Το email είναι υποχρεωτικό.")
    @Email(message = "Το email πρέπει να είναι έγκυρη διεύθυνση.")
    @Size(max = 50, message = "Το email δεν μπορεί να υπερβαίνει τους 50 χαρακτήρες.")
    private String email;

    @NotBlank(message = "Η διεύθυνση είναι υποχρεωτική.")
    @Size(max = 255, message = "Η διεύθυνση δεν μπορεί να υπερβαίνει τους 255 χαρακτήρες.")
    private String address;

}
