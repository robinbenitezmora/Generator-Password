
public class CharacterRule {

 public static void main(String[] args) {
  PasswordGenerator passwordGenerator = new PasswordGenerator();
  CharacterRule lowerCaseRule = new CharacterRule();
  lowerCaseRule.setNumberOfCharacters(2);

  CharacterRule upperCaseRule = new CharacterRule();
  upperCaseRule.setNumberOfCharacters(2);

  CharacterRule digitRule = new CharacterRule();
  digitRule.setNumberOfCharacters(2);

  CharacterRule specialCharRule = new CharacterRule();
  specialCharRule.setNumberOfCharacters(2);

  String password = passwordGenerator.generatePassword(10, specialCharRule, lowerCaseRule,
    upperCaseRule, digitRule);
  System.out.println(password);
 }

 void setNumberOfCharacters(int i) {
 }
}
