import { type } from "os"

export type RecordsResponse = {
    content: RecordItem[];
    totalPages: number;
}

export type RecordItem = {
    id: number;
    moment: string;
    name: string;
    age: number;
    gameTitle: string;
    gamePlatform: PLATFORM;
    genreGame: string;
};

export type PLATFORM = 'XBOX' | 'PC' | 'PLAYTATION';