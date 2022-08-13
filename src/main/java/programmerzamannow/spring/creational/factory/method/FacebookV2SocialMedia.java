package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

@Getter
public class FacebookV2SocialMedia implements SocialMedia{

  private final String name = "FACEBOOK";

  private final String link = "https://web.facebook.com";

  private final SocialMediaType type = SocialMediaType.FACEBOOK;

}
