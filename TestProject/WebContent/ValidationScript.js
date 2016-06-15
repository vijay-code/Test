 
	  //<!-- Date picker  -->
	  
	  $(function() {

		    $( "#datepicker1" ).datepicker();

		  });
	  
	  

	  // allowing only numbers !!

	  $(document).ready(function () {
		  //called when key is pressed in textbox
		  $("#quantity").keypress(function (e) {
		     //if the letter is not digit then display error and don't type anything
		     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#incomeerr").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
		   });
	  });
	  
	  $(document).ready(function () {
		  //called when key is pressed in textbox
		  $("#quantity1").keypress(function (e) {
		     //if the letter is not digit then display error and don't type anything
		     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#tdserr").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
		   });
	  });
	  
	  $(document).ready(function () {
		  //called when key is pressed in textbox
		  $("#quantity2").keypress(function (e) {
		     //if the letter is not digit then display error and don't type anything
		     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
		        //display error message
		        $("#taxdederr").html("Digits Only").show().fadeOut("slow");
		               return false;
		    }
		   });
	  });
	  
	  
	  
	  //allowing only alphabets !!
	  
	  
	  $(function () {
	      $('#txtFirstName').keydown(function (e) {
	          if (e.shiftKey || e.ctrlKey || e.altKey) {
	              e.preventDefault();
	          } else {
	              var key = e.keyCode;
	              if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
	                  e.preventDefault();
	                  $("#nameerr").html("Alphabets Only").show().fadeOut("slow");
		               return false;
	              }
	          }
	      });
	      });

	  //for assement year validation.
	  
	  function isNumberKey(evt)
	  {
	     var charCode = (evt.which) ? evt.which : event.keyCode
	     if (charCode != 45  && charCode > 31 && (charCode < 48 || charCode > 57))
	        return false;

	     return true;
	  }
	  
// for Pan Card validation
	  
	  $(function(){
		    $("#pancard").keypress(function(event){
		        var ew = event.which;
		        if(ew == 32)
		            return true;
		        if(48 <= ew && ew <= 57)
		            return true;
		        if(65 <= ew && ew <= 90)
		            return true;
		        if(97 <= ew && ew <= 122)
		            return true;
		        return false;
		    });
		});
	  
	  