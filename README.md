# spring-boot-otp-login
Spring boot OTP based login with Twilio and JWT token

## Workflow
1. User enter mobile no
2. Generate OTP using Twilio
3. User enter OTP recevied in mobile number
4. Verify OTP and generate JWT if user otp is valid
5. User send any request using jwt
