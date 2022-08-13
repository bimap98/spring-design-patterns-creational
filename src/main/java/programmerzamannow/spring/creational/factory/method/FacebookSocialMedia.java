package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

@Getter
@Deprecated
public class FacebookSocialMedia implements SocialMedia{

  private final String name = "FACEBOOK";

  private final String link = "https://facebook.com";

  private final SocialMediaType type = SocialMediaType.FACEBOOK;

}
