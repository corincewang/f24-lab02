import { newRenderer } from "./renderer.js"
import { Rectangle, newRectangle } from "./shapes/rectangle.js";

const shape: Shape = newRectangle(4, 3)
const renderer = newRenderer(shape)
renderer.draw();