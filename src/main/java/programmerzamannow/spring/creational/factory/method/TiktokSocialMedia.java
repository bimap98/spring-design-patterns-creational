package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

@Getter
public class TiktokSocialMedia implements SocialMedia{

  private final String name = "TIKTOK";

  private final String link = "https://tiktok.com";

  private final SocialMediaType type = SocialMediaType.TIKTOK;

}
