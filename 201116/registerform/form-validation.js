// Wait for the DOM to be ready
$(function() {
  // Initialize form validation on the registration form.
  // It has the name attribute "registration"
  $("form[name='registration']").validate({
    // Specify validation rules
    rules: {
      // The key name on the left side is the name attribute
      // of an input field. Validation rules are defined
      // on the right side
      firstName: {
        required: true,
        minlength: 2,
        maxlength:30
      }, 
      lastName:{
        required: true,
        minlength: 2,
        maxlength:30
      },
      dob: "required",
      

      email: {
        required: true,
        // Specify that email should be validated
        // by the built-in "email" rule
        email: true
      },
      phoneNumber:{
        required: true,
        minlength: 11,
        maxlength:11,
      }, 
      pass: {
        required: true,
        minlength: 5,
        maxlength:20
      },
      confirmPass:{
        equalTo:"#pass",
      }
    },
    // Specify validation error messages
    messages: {

      firstName:{
       required: "Please enter your firstname",
       minlength: "Your firstname must be under 2-30 characters long"
      },
      lastName:{
       required: "Please enter your lastname",
       minlength: "Your firstname must be under 2-30 characters long"
      },
      pass: {
        required: "Please provide a password",
        minlength: "Your password must be under 5-20 characters long"
      },
      email: "Please enter a valid email address",

      phoneNumber:{
       required: "Please enter your phone Number",
       minlength: "number invalid,too short",
       maxlength: "number invalid,too long",

      },
         
      confirmPass:"Did not match with Password",
    },
    // Make sure the form is submitted to the destination defined
    // in the "action" attribute of the form when valid
    submitHandler: function(form) {
      form.submit();
    }
  });
});