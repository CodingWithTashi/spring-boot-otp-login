<div style="background-color: #f0f8ff; color: #000; padding: 10px; border-radius: 5px; text-align: center;">
  <strong>✊ We stand in solidarity with the Tibetan people in their struggle for freedom and cultural preservation. Learn more at <a href="https://www.freetibet.org" target="_blank">Free Tibet</a>.</strong>
</div>

# spring-boot-otp-login
Spring boot OTP based login with Twilio and JWT token


## Note
`If you've found any of my open-source projects useful,Consider giving them a star ⭐ and following me. It's free for you, but it greatly motivates me to keep contributing more.`

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
