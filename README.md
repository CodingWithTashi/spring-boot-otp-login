# spring-boot-otp-login
Spring boot OTP based login with Twilio and JWT token


## Note
`If you found any of my open source projects helpful, Don't forget to give them a star ⭐ and follow. It won't cost you a thing, but it will help inspire me to continue contribute more `

## Workflow
1. User enter mobile no
2. Generate OTP using Twilio
3. User enter OTP recevied in mobile number
4. Verify OTP and generate JWT if user otp is valid
5. User send any request using jwt

## Request OTP GET
* /api/client/auth/requestOtp/{phoneNo}

* Response
```{
    "message": "Otp sent successfully",
    "status": "success",
    "otp":"312323"
}   
```

## Verify OTP POST
* /api/client/auth/verifyOtp/

* Body
```
{
	"otp":"687619",
	"phoneNo":"+916361445559"
}
```

* Response
```
{
    "message": "Otp verified successfully",
    "status": "success",
    "jwt": "jwt_token_here"
}
```

## Call other api with JWT Token
* /api/client/auth/hello
* Header 
```
{
"Authorization":"Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIrOTE2MzYxNDA4NTU5IiwiZXhwIjoxNjYxMTE3MDMzLCJpYXQiOjE2NjEwODEwMzN9._dK8aFLrebA_42rAW3oJfuMhFimiWabioadhC6CRWJ4"
}
```
* Response
Hello World
