package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

@Getter
public class InstagramSocialMedia implements SocialMedia{

  private final String name = "INSTAGRAM";

  private final String link = "https://instagram.com";

  private final SocialMediaType type = SocialMediaType.INSTAGRAM;

}
