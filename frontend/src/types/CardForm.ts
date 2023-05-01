interface CardForm extends HTMLFormControlsCollection {
  anwer: HTMLInputElement;
}

interface CardFormElement extends HTMLFormElement {
  readonly elements: CardForm;
}