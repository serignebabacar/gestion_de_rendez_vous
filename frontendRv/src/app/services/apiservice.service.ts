import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {environment} from '../../environments/environment';
import { RendezVous } from '../modeles/rendezvous';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ApiserviceService {
  private urlApi = environment.urlService;

  constructor(private httpService:HttpClient) { }

  /**
   * getRvs:Observable
   */
  public getRvs():Observable<RendezVous[]> {
    return this.httpService.get<RendezVous[]>(this.urlApi+"/rvs");
   }
}
