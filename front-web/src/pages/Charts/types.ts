import { PLATFORM } from "../Records/types";

export type Game = {
    id: number;
    title: string;
    platform: PLATFORM;
};

export type ChartItem = {
    x: string;
    y: number;
};