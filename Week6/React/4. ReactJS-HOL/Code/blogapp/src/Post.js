export default class Post {
  constructor({ userId, id, title, body }) {
    this.userId = userId;
    this.id     = id;
    this.title  = title;
    this.body   = body;
  }
}
