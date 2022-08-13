package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

@Getter
public class TwitterSocialMedia implements SocialMedia{

  private final String name = "TWITTER";

  private final String link = "https://twitter.com";

  private final SocialMediaType type = SocialMediaType.TWITTER;

}
